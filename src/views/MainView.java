package views;
import controller.*;
import model.Commander;
import exception.InvalidInputException;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainView {
    private static final Scanner scanner = new Scanner(System.in);
    private List<Commander> commanders;
    private FileManager fileManager = FileManager.getInstance();

    public void showMenu() {
        System.out.println("1. Add Commander");
        System.out.println("2. Add Subordinate");
        System.out.println("3. Delete Subordinate");
        System.out.println("4. Save to File");
        System.out.println("5. Load from File");
        System.out.println("6. Exit");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                addCommander();
                break;
            case 2:
                addSubordinate();
                break;
            case 3:
                deleteSubordinate();
                break;
            case 4:
                saveToFile();
                break;
            case 5:
                loadFromFile();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
    public void addCommander() {
        System.out.print("Enter commander name: ");
        String name = scanner.nextLine();
        System.out.print("Enter commander rank: ");
        String rank = scanner.nextLine();

        if (!InputValidator.validateName(name) || !InputValidator.validateRank(rank)) {
            try {
                throw new InvalidInputException("Invalid name or rank format.");
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        Commander commander = new Commander(1, name, rank);
        commanders.add(commander);
        System.out.println("Commander added.");
    }

    public void addSubordinate() {
        // Implement logic to add subordinate
    }

    public void deleteSubordinate() {
        // Implement logic to delete subordinate
    }

    public void saveToFile() {
        try {
            fileManager.saveToFile(commanders);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        try {
            commanders = fileManager.loadFromFile();
            if (commanders == null) {
                System.out.println("File not found or empty.");
            } else {
                commanders.forEach(System.out::println);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}
