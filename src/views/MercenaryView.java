package views;
import model.Mercenary;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MercenaryView {
    public int displayMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Read file");
        System.out.println("2. Add mercenary");
        System.out.println("3. Update mercenary profile");
        System.out.println("4. Delete mercenary");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        return choice;
    }
    public Mercenary inputMercenaryDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mercenary ID: ");
        int merId = sc.nextInt();
        System.out.println("Enter Mercenary Name: ");
        String merName = sc.next();
        System.out.println("Enter Mercenary Age: ");
        int merAge = sc.nextInt();
        System.out.println("Enter Mercenary Salary: ");
        double merSalary = sc.nextDouble();
        System.out.println("Enter Mercenary Bonus: ");
        double merBonus = sc.nextDouble();
        return new Mercenary(merId, merName, merAge, merSalary, merBonus);
    }
    public String inputFilePath(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        return sc.nextLine();
    }
    public void displayMercenary(List<Mercenary> mercenaryList){
        if(mercenaryList.isEmpty()){
            System.out.println("No mercenary found");
        }else {
            for(Mercenary merc : mercenaryList){
                System.out.println(merc);
            }
        }
    }
    public void displayMessage(String message){
        System.out.println(message);
    }
}
