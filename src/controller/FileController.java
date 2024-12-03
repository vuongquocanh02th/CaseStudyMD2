package controller;

import interfaces.FileMerOperation;
import model.Mercenary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController implements FileMerOperation<Mercenary> {
    //
    private static FileController instance;

    private FileController() {
    }

    //Singleton
    public static FileController getInstance() {
        if (instance == null) {
            instance = new FileController();
        }
        return instance;
    }

    @Override
    public List<Mercenary> readFromFile(String fileName) {
        List<Mercenary> mercenaryList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(";");
                int merId = Integer.parseInt(details[0].trim());
                String merName = details[1].trim();
                int merAge = Integer.parseInt(details[2].trim());
                double merSalary = Double.parseDouble(details[3].trim());
                double merBonus = Double.parseDouble(details[4].trim());
                mercenaryList.add(new Mercenary(merId, merName, merAge, merSalary, merBonus));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mercenaryList;
    }

    @Override
    public void writeToFile(String fileName, List<Mercenary> items) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Mercenary merc : items) {
                bw.write(merc.getMerId() + ", " + merc.getMerName() + ", "
                        + merc.getMerAge() + ", " + merc.getMerSalary() + ", " + merc.getMerBonus());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addToFile(String fileName, Mercenary item) {
        List<Mercenary> mercenaryList = readFromFile(fileName);
        mercenaryList.add(item);
        writeToFile(fileName, mercenaryList);
    }

    @Override
    public void updateInFile(String fileName, Mercenary item) {
        List<Mercenary> mercenaryList = readFromFile(fileName);
        for(int i = 0; i < mercenaryList.size(); i++) {
            if(mercenaryList.get(i).getMerId() == item.getMerId()) {
                mercenaryList.set(i, item);
                break;
            }
        }
        writeToFile(fileName, mercenaryList);
    }

    @Override
    public void deleteFromFile(String fileName, Mercenary item) {
        List<Mercenary> mercenaryList = readFromFile(fileName);
        mercenaryList.removeIf(mercenary -> mercenary.getMerId() == item.getMerId());
        writeToFile(fileName, mercenaryList);
    }
    //Tao file neu file khong ton tai
    public void createFile(String fileName) {
        File file = new File(fileName);
        try{
            if(!file.exists()) {
                file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
