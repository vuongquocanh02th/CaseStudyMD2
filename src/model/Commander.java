package model;

import java.util.ArrayList;
import java.util.List;

public class Commander {
    private int commanderID;
    private String commanderName;
    private double money;


    public Commander(int commanderID, String commanderName) {
        this.commanderID = commanderID;
        this.commanderName = commanderName;
        this.money = 1000000;
    }

    public boolean hireMercenary(Mercenary mercenary) {
        if (this.money >= mercenary.getHirePrice()) {
            this.money -= mercenary.getHirePrice();
            System.out.println("Mercenary hired. Remaining money: " + this.money);
            return true;
        } else {
            System.out.println("Not enough money to hire Mercenary.");
            return false;
        }
    }


    public int getCommanderID() {
        return commanderID;
    }

    public void setCommanderID(int commanderID) {
        this.commanderID = commanderID;
    }

    public String getCommanderName() {
        return commanderName;
    }

    public void setCommanderName(String commanderName) {
        this.commanderName = commanderName;
    }



    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
