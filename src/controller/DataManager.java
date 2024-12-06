package controller;

import model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager instance;
    private CommanderList commanderList;
    private MercenaryList mercenaryList;
    private EnemyList enemyList;

    private DataManager() {
        commanderList = new CommanderList();
        mercenaryList = new MercenaryList();
        enemyList = new EnemyList();
        loadData();
    }

    private void loadData() {
        loadCommanders();
        loadMercenaries();
        loadEnemies();
    }

    private void loadEnemies() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\CodeGym\\Module2\\case-study\\src\\files\\EnemyList.dat"))) {
            enemyList.setEnemies((List<Enemy>) ois.readObject());
        } catch (EOFException e) {
            System.out.println("File empty! No data to read!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void loadMercenaries() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\CodeGym\\Module2\\case-study\\src\\files\\MercenaryList.dat"))) {
            mercenaryList.setMercenaries((List<Mercenary>) ois.readObject());
        } catch (EOFException e) {
            System.out.println("File empty! No data to read!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void loadCommanders() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\CodeGym\\Module2\\case-study\\src\\files\\CommanderList.dat"))) {
            commanderList.setCommanders((List<Commander>) ois.readObject());
            for (Commander commander : commanderList.getCommanders()) {
                System.out.println("Commander ID: " + commander.getCommanderID());
                System.out.println("Commander Name: " + commander.getCommanderName());
                System.out.println("Commander Money: " + commander.getMoney());
                System.out.println("-----------------------------");
            }
        } catch (EOFException e) {
            System.out.println("File empty! No data to read!");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static DataManager getInstance() {
        if (instance == null) {
            instance = new DataManager();
        }
        return instance;
    }

    public CommanderList getCommanderList() {
        return commanderList;
    }

    public MercenaryList getMercenaryList() {
        return mercenaryList;
    }

    public EnemyList getEnemyList() {
        return enemyList;
    }

    // Lưu Commander vào file .dat và .csv
    public void saveCommanders() {
        // Lưu vào .dat
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\CodeGym\\Module2\\case-study\\src\\files\\CommanderList.dat"))) {
            oos.writeObject(commanderList.getCommanders());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lưu vào .csv
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\CodeGym\\Module2\\case-study\\src\\files\\CommanderList.csv"))) {
            for (Commander commander : commanderList.getCommanders()) {
                writer.write(commander.getCommanderID() + "," + commander.getCommanderName() + "," + commander.getMoney());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lưu Mercenary vào file .dat và .csv
    public void saveMercenaries() {
        // Lưu vào .dat
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\CodeGym\\Module2\\case-study\\src\\files\\MercenaryList.dat"))) {
            oos.writeObject(mercenaryList.getMercenaries());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lưu vào .csv
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\CodeGym\\Module2\\case-study\\src\\files\\MercenaryList.csv"))) {
            for (Mercenary mercenary : mercenaryList.getMercenaries()) {
                writer.write(mercenary.getMerId() + "," + mercenary.getMerName() + "," + mercenary.getUnit() + "," + mercenary.getHirePrice() + "," + mercenary.getCommanderName());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lưu Enemy vào file .dat và .csv
    public void saveEnemies() {
        // Lưu vào .dat
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\CodeGym\\Module2\\case-study\\src\\files\\EnemyList.dat"))) {
            oos.writeObject(enemyList.getEnemies());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lưu vào .csv
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\CodeGym\\Module2\\case-study\\src\\files\\EnemyList.csv"))) {
            for (Enemy enemy : enemyList.getEnemies()) {
                writer.write(enemy.getEnemyId() + "," + enemy.getEnemyName());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Commander> readDataFromFileCmd(String filePath) {
        List<Commander> commanderList = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            commanderList = (List<Commander>) objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return commanderList;
    }
    public static List<Mercenary> readDataFromFileMerc(String filePath) {
        List<Mercenary> mercenaries = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            mercenaries = (List<Mercenary>) objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return mercenaries;
    }
    public static List<Enemy> readDataFromFileEnemy(String filePath) {
        List<Enemy> enemies = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            enemies = (List<Enemy>) objectInputStream.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return enemies;
    }
}
