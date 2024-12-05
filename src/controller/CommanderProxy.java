package controller;

import model.Commander;

public class CommanderProxy {
    private Commander commander;

    public CommanderProxy(Commander commander) {
        this.commander = commander;
    }

    public void setMoney(double money) {
        if (money >= 0) {
            commander.setMoney(money);
        } else {
            System.out.println("Invalid money value.");
        }
    }

    public double getMoney() {
        return commander.getMoney();
    }
}
