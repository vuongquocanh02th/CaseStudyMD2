package controller;

import model.Commander;

import java.io.*;
import java.util.List;
//SINGLETON PATTERN
public class FileManager {
    private static FileManager instance;

    private FileManager() {

    }
    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }
    public void saveToFile(List<Commander> commanders) throws IOException {
        File file = new File("commanders.dat");
        if (!file.exists()) {
            file.createNewFile();
        }
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(commanders);
        }
    }
    public List<Commander> loadFromFile() throws IOException, ClassNotFoundException {
        File file = new File("commanders.dat");
        if (!file.exists()) {
            return null;
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Commander>) ois.readObject();
        }
    }
}
