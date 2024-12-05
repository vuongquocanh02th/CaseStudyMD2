package controller;

import model.Commander;
import model.CommanderList;
import model.Mercenary;
import model.MercenaryList;


public class AddMercenaryCommand implements Command{
    private Mercenary mercenary;
    private CommanderList commanderList;
    private MercenaryList mercenaryList;
    public AddMercenaryCommand(Mercenary mercenary, CommanderList commanderList, MercenaryList mercenaryList) {
        this.mercenary = mercenary;
        this.commanderList = commanderList;
        this.mercenaryList = mercenaryList;
    }
    @Override
    public void execute() {
        Commander commander = commanderList.getCommanders().stream()
                .filter(c -> c.getCommanderName().equals(mercenary.getCommanderName()))
                .findFirst()
                .orElse(null);

        if (commander != null && commander.getMoney() >= mercenary.getHirePrice()) {
            mercenaryList.addMercenary(mercenary);
            commander.setMoney(commander.getMoney() - mercenary.getHirePrice());
            System.out.println("Mercenary added. Remaining money: " + commander.getMoney());
        } else {
            System.out.println("Not enough money or Commander not found.");
        }
    }
}
