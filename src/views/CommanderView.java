package views;

import model.Commander;

public class CommanderView {
    public void displayCommanderInfo(Commander commander) {
        System.out.println("Commander Info: ");
        System.out.println("Id: "+commander.getCommanderID());
        System.out.println("Name: "+commander.getCommanderName());
        System.out.println("Rank: "+commander.getCommanderRank());
        System.out.println("Money: "+commander.getMoney());
    }
}
