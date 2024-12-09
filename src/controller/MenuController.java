package controller;

import model.Commander;
import model.CommanderList;
import model.Enemy;
import model.Mercenary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuController {
    private DataManager dataManager;

    public MenuController() {
        this.dataManager = DataManager.getInstance();
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Commander");
            System.out.println("2. Add Mercenary");
            System.out.println("3. Add Enemy");
            System.out.println("4. Update Mercenary");
            System.out.println("5. Sack Mercenary");
            System.out.println("6. Kill Enemy");
            System.out.println("7. Sack Commander");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Thêm Commander
                    addCommander(scanner);
                    System.out.println("Commander List in dat file: ");
                    readCommanderData("D:\\CodeGym\\Module2\\case-study\\src\\files\\CommanderList.dat");
                    break;
                case 2:
                    // Thêm Mercenary
                    addMercenary(scanner);
                    System.out.println("Mercenary List in dat file: ");
                    readMercData("D:\\CodeGym\\Module2\\case-study\\src\\files\\MercenaryList.dat");
                    break;
                case 3:
                    // Thêm Enemy
                    addEnemy(scanner);
                    System.out.println("Enemy List in dat file: ");
                    readEnemyData("D:\\CodeGym\\Module2\\case-study\\src\\files\\EnemyList.dat");
                    break;
                case 4:
                    // Sửa Mercenary
                    updateMercenary(scanner);
                    break;
                case 5:
                    // Xóa Mercenary
                    removeMercenary(scanner);
                    break;
                case 6:
                    // Xóa Enemy
                    removeEnemy(scanner);
                    break;
                case 7:
                    // Xóa Commander
                    removeCommander(scanner);
                    break;
                case 8:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void readCommanderData(String filePath) {
        List<Commander> commanderDataFromFile = DataManager.readDataFromFileCmd(filePath);
        for (Commander commander : commanderDataFromFile) {
            System.out.println(commander);
        }
    }
    private void readMercData(String filePath) {
        List<Mercenary> mercDataFromFile = DataManager.readDataFromFileMerc(filePath);
        for (Mercenary mercenary : mercDataFromFile) {
            System.out.println(mercenary);
        }
    }
    private void readEnemyData(String filePath) {
        List<Enemy> enemyDataFromFile = DataManager.readDataFromFileEnemy(filePath);
        for (Enemy enemy : enemyDataFromFile) {
            System.out.println(enemy);
        }
    }
    private void removeCommander(Scanner scanner) {
        System.out.print("Enter commander ID to fire: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Commander commander = dataManager.getCommanderList().getCommanders().stream()
                .filter(c -> c.getCommanderID() == id)
                .findFirst()
                .orElse(null);

        if (commander != null) {
            // Kiểm tra xem Commander có Mercenary nào không
            boolean hasMercenaries = dataManager.getMercenaryList().getMercenaries().stream()
                    .anyMatch(m -> m.getCommanderName().equals(commander.getCommanderName()));

            if (hasMercenaries) {
                System.out.println("Cannot fire commander working!");
            } else {
                dataManager.getCommanderList().removeCommander(id);
                dataManager.saveCommanders();
                System.out.println("Commander sacked successfully.");
            }
        } else {
            System.out.println("Commander not found.");
        }
    }

    private void removeEnemy(Scanner scanner) {
        System.out.print("Aim at Enemy to kill: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Enemy enemy = dataManager.getEnemyList().getEnemies().stream()
                .filter(e -> e.getEnemyId() == id)
                .findFirst()
                .orElse(null);

        if (enemy != null) {
            dataManager.getEnemyList().removeEnemy(id);
            Commander commander = dataManager.getCommanderList().getCommanders().stream()
                    .filter(c -> c.getMoney() > 100000)  // Assuming commander has more money after killing an enemy
                    .findFirst()
                    .orElse(null);

            if (commander != null) {
                commander.setMoney(commander.getMoney() + 2000);
                System.out.println("Enemy killed! Commander’s money increased: " + commander.getMoney());
            }
            dataManager.saveEnemies();
            dataManager.saveCommanders();
            System.out.println("You killed an enemy! Clear all enemies to win the battle!");
        } else {
            System.out.println("Enemy not found.");
        }
    }

    private void removeMercenary(Scanner scanner) {
        System.out.print("Enter mercenary Id need to be sacked: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Mercenary mercenary = dataManager.getMercenaryList().getMercenaries().stream()
                .filter(m -> m.getMerId() == id)
                .findFirst()
                .orElse(null);

        if (mercenary != null) {
            dataManager.getMercenaryList().removeMercenary(id);
            Commander commander = dataManager.getCommanderList().getCommanders().stream()
                    .filter(c -> c.getCommanderName().equals(mercenary.getCommanderName()))
                    .findFirst()
                    .orElse(null);
            dataManager.saveMercenaries();
            System.out.println("Mercenary sacked successfully.");
        } else {
            System.out.println("Mercenary not found.");
        }
    }

    private void updateMercenary(Scanner scanner) {
        System.out.print("Enter mercenary Id need update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Mercenary mercenary = dataManager.getMercenaryList().getMercenaries().stream()
                .filter(m -> m.getMerId() == id)
                .findFirst()
                .orElse(null);

        if (mercenary != null) {
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter new unit: ");
            String newUnit = scanner.nextLine();

            System.out.print("Enter new hire Price: ");
            double newHirePrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            mercenary = new Mercenary(id, newName, newUnit, newHirePrice, mercenary.getCommanderName());

            // Cập nhật Mercenary
            dataManager.getMercenaryList().removeMercenary(id);
            dataManager.getMercenaryList().addMercenary(mercenary);
            dataManager.saveMercenaries();
            System.out.println("Mercenary updated successfully.");
        } else {
            System.out.println("Mercenary not found.");
        }
    }

    private void addEnemy(Scanner scanner) {
        System.out.print("Enter enemy Id: ");
        int id = scanner.nextInt();
        //int id;
        scanner.nextLine();
        if (dataManager.getEnemyList().getEnemies().stream()
                .anyMatch(e -> e.getEnemyId() == id)) {
            System.out.println("Enemy ID already exists. Please enter a different ID.");
            return; // Exit method and prevent adding an enemy with the same ID
        }
        String name;
        while (true) {
//            System.out.print("Enter enemy Id: ");
//            id = scanner.nextInt();
//            scanner.nextLine();

            System.out.print("Enter enemy Name (start with Upper, no number, can contain spaces): ");
            name = scanner.nextLine();

            // Kiểm tra tính hợp lệ của tên
            if (RegexValidator.validateName(name)) {
                break;  // Thoát vòng lặp nếu tên hợp lệ
            } else {
                System.out.println("Invalid! Again!");
            }
        }

        Enemy enemy = new Enemy(id, name);
        dataManager.getEnemyList().addEnemy(enemy);
        dataManager.saveEnemies();
        System.out.println("Enemy added successfully.");
    }

    private void addMercenary(Scanner scanner) {
        if (dataManager.getCommanderList().getCommanders().isEmpty()) {
            System.out.println("Commander is Empty, add Commander first.");
            return;
        }

        System.out.print("Enter mercenary Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (dataManager.getMercenaryList().getMercenaries().stream()
                .anyMatch(m -> m.getMerId() == id)) {
            System.out.println("Mercenary ID already exists. Please enter a different ID.");
            return; // Exit method and prevent adding a mercenary with the same ID
        }
        String name;
        while (true) {
            System.out.print("Enter mercenary Name (start with Upper, no number, can contain spaces): ");
            name = scanner.nextLine();

            // Kiểm tra tính hợp lệ của tên
            if (RegexValidator.validateName(name)) {
                break;  // Thoát vòng lặp nếu tên hợp lệ
            } else {
                System.out.println("Invalid! Again!");
            }
        }
        System.out.print("Enter mercenary Unit: ");
        String unit = scanner.nextLine();

        System.out.print("Enter hire Price: ");
        double hirePrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Commander Name: ");
        String commanderName = scanner.nextLine();

        // Kiem tra xem Commander co ton tai khong
        Commander commander = dataManager.getCommanderList().getCommanders().stream()
                .filter(c -> c.getCommanderName().equals(commanderName))
                .findFirst()
                .orElse(null);

        if (commander != null && commander.getMoney() >= hirePrice) {
            Mercenary mercenary = new Mercenary(id, name, unit, hirePrice, commanderName);
            AddMercenaryCommand command = new AddMercenaryCommand(mercenary, dataManager.getCommanderList(), dataManager.getMercenaryList());
            command.execute();
            dataManager.saveMercenaries();
            dataManager.saveCommanders();
        } else {
            System.out.println("Not enough money to hire or Commander not exists.");
        }
    }

    private void addCommander(Scanner scanner) {
        System.out.print("Enter commander Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (dataManager.getCommanderList().getCommanders().stream()
                .anyMatch(c -> c.getCommanderID() == id)) {
            System.out.println("Commander ID already exists. Please enter a different ID.");
            return; // Exit method and prevent adding a commander with the same ID
        }
        String name;
        while (true) {
            System.out.print("Enter commander Name (start with Upper, no number, can contain spaces): ");
            name = scanner.nextLine();

            // Kiểm tra tính hợp lệ của tên
            if (RegexValidator.validateName(name)) {
                break;  // Thoát vòng lặp nếu tên hợp lệ
            } else {
                System.out.println("Invalid! Again!");
            }
        }
        Commander commander = new Commander(id, name);
        dataManager.getCommanderList().addCommander(commander);
        dataManager.saveCommanders();
        System.out.println("Commander added successfully.");
    }

}
