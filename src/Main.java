import controller.FileController;
import model.Mercenary;
import views.MercenaryView;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MercenaryView mercenaryView = new MercenaryView();
        FileController fileController = FileController.getInstance();
        Scanner scanner = new Scanner(System.in);
        //Nhap filepath
        String fileName = mercenaryView.inputFilePath();
        fileController.createFile(fileName);
        while (true) {
            int choice = mercenaryView.displayMenu();
            switch (choice) {
                case 1:
                    List<Mercenary> mercenaryList = fileController.readFromFile(fileName);
                    mercenaryView.displayMercenary(mercenaryList);
                    break;
                case 2:
                    Mercenary newMerc = mercenaryView.inputMercenaryDetails();
                    fileController.addToFile(fileName, newMerc);
                    mercenaryView.displayMessage("Add success!");
                    break;
                case 3:
                    Mercenary updateMerc = mercenaryView.inputMercenaryDetails();
                    fileController.updateInFile(fileName, updateMerc);
                    mercenaryView.displayMessage("Update success!");
                    break;
                case 4:
                    Mercenary deleteMerc = mercenaryView.inputMercenaryDetails();
                    fileController.deleteFromFile(fileName, deleteMerc);
                    mercenaryView.displayMessage("Delete success!");
                    break;
                case 5:
                    System.out.println("Exiting program");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}