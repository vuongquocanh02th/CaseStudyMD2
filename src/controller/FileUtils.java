package controller;

import model.Commander;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static void createFilesIfNotExist() {
        String[] files = {"D:\\CodeGym\\Module2\\case-study\\src\\files\\CommanderList.dat",
                "D:\\CodeGym\\Module2\\case-study\\src\\files\\CommanderList.csv",
                "D:\\CodeGym\\Module2\\case-study\\src\\files\\MercenaryList.dat",
                "D:\\CodeGym\\Module2\\case-study\\src\\files\\MercenaryList.csv",
                "D:\\CodeGym\\Module2\\case-study\\src\\files\\EnemyList.dat",
                "D:\\CodeGym\\Module2\\case-study\\src\\files\\EnemyList.csv"};

        for (String file : files) {
            File f = new File(file);
            if (!f.exists()) {
                try {
                    f.createNewFile();
                    System.out.println("Created new file: " + f.getName());
                } catch (IOException e) {
                    System.out.println("Error creating file: " + f.getName());
                }
            }
        }
    }

    public static void saveCommandersToFile(List<Commander> commanders) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("files/CommanderList.dat"))) {
            oos.writeObject(commanders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Commander> readCommandersFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("files/CommanderList.dat"))) {
            return (List<Commander>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
