import controller.FileController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileController controller = new FileController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Read file");
            System.out.println("2. Write to file");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline character

            switch (choice) {
                case 1:
                    controller.readFile();
                    break;
                case 2:
                    controller.writeFile();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }
}