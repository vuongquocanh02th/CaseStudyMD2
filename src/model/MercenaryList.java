package model;

import java.io.*;
import java.util.*;

public class MercenaryList {
    private List<Mercenary> mercenaries;
    private static final String FILE_PATH = "MercenaryList.dat";

    public MercenaryList() {
        this.mercenaries = new ArrayList<>();
        loadFromFile();
    }

    public void addMercenary(Mercenary mercenary) {
        mercenaries.add(mercenary);
        saveToFile();
    }

    public void removeMercenary(int id) {
        mercenaries.removeIf(mercenary -> mercenary.getMerId() == id);
        saveToFile();
    }

    public List<Mercenary> getMercenaries() {
        return mercenaries;
    }

    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            mercenaries = (List<Mercenary>) ois.readObject();
        } catch (Exception e) {
            System.out.println("No previous data found, starting fresh.");
        }
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(mercenaries);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
