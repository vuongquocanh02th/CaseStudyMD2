package model;
import java.io.*;
import java.util.*;

public class CommanderList {
    private List<Commander> commanders;
    private static final String FILE_PATH = "CommanderList.dat";

    public CommanderList() {
        this.commanders = new ArrayList<>();
        loadFromFile();
    }

    public void addCommander(Commander commander) {
        commanders.add(commander);
        saveToFile();
    }

    public void removeCommander(int id) {
        commanders.removeIf(commander -> commander.getCommanderID() == id);
        saveToFile();
    }

    public List<Commander> getCommanders() {
        return commanders;
    }

    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            commanders = (List<Commander>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No previous data found, starting fresh.");
        }
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(commanders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
