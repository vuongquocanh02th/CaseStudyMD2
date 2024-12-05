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
        }
    }
}
