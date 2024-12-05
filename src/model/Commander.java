package model;

import java.util.ArrayList;
import java.util.List;

public class Commander {
    private int commanderID;
    private String commanderName;
    private String commanderRank;
    private double money = 100000;
    private List<Mercenary> mercenaryList;

    public Commander(int commanderID, String commanderName, String commanderRank) {
        this.commanderID = commanderID;
        this.commanderName = commanderName;
        this.commanderRank = commanderRank;
        this.mercenaryList = new ArrayList<>();
    }

    public void addMercenary(Mercenary mercenary) {
        if (this.money >= mercenary.getHirePrice()) {
            mercenaryList.add(mercenary);
            this.money -= mercenary.getHirePrice();
            System.out.println("Mercenary added: " + mercenary.getMerName());
            System.out.println("Remaining money: " + this.money);
        } else {
            System.out.println("Not enough money to hire " + mercenary.getMerName());
        }
    }

    public void removeMercenary(Mercenary mercenary) {
        if(mercenaryList.remove(mercenary)){
            this.money += mercenary.getHirePrice();
            System.out.println("Mercenary removed: " + mercenary.getMerName());
            System.out.println("Remaining money: " + this.money);
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

    public String getCommanderRank() {
        return commanderRank;
    }

    public void setCommanderRank(String commanderRank) {
        this.commanderRank = commanderRank;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public List<Mercenary> getMercenaryList() {
        return mercenaryList;
    }

    public void setMercenaryList(List<Mercenary> mercenaryList) {
        this.mercenaryList = mercenaryList;
    }
    public double gainMoney(){
        return this.money + 2000;
    }

}
