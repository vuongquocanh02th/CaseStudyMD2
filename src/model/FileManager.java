package model;

import java.io.*;
import java.util.*;

public class FileManager {
    //Step1: Tao mot instance duy nhat cua file manager
    private static FileManager instance;

    //Step 2: Cau truc Singleton, private constructor
    private FileManager() {
    }

    //Step 3: Phuong thuc de lay instance duy nhat
    public static FileManager getInstance() {
        if (instance == null) {
            instance = new FileManager();
        }
        return instance;
    }

    //Step 4: Phuong thuc de doc du lieu tu file
    public List<String> readFile(String fileName) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
    //Step 5: Phuong thuc de ghi du lieu vao file
    // Step 5: Phương thức để ghi dữ liệu vào file
    public void writeFile(String fileName, List<String> content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String line : content) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
