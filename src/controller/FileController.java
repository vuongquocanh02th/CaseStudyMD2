package controller;

import java.io.*;
import java.util.List;

import model.*;

public class FileController {
    public void saveToFile(List<Commander> commanders, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeObject(commanders);
        } catch (IOException e) {
            System.out.println("Error saving file :" + e.getMessage());
        }
    }
    public List<Commander> loadFromFile(String fileName) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))){
            return (List<Commander>) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading file :" + e.getMessage());
            return null;
        }
    }
}
