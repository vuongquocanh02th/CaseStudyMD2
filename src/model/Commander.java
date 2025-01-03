package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Commander implements Serializable {
    private static final long serialVersionUID = 1L;
    private int commanderID;
    private String commanderName;
    private double money;


    public Commander(int commanderID, String commanderName) {
        this.commanderID = commanderID;
        this.commanderName = commanderName;
        this.money = 1000000;
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

    @Override
    public String toString() {
        return "Commander{" +
                "commanderID=" + commanderID +
                ", commanderName='" + commanderName + '\'' +
                ", money=" + money +
                '}';
    }
}
