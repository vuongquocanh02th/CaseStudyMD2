package model;

import java.io.Serializable;
import java.util.List;

public class Commander implements Serializable {
    private int commanderId;
    private String commanderName;
    private String commanderRank;
    private List<Object> subordinates;    //List cac doi tuong thuoc cac model con lai

    public Commander(int commanderId, String commanderName, String commanderRank) {
        this.commanderId = commanderId;
        this.commanderName = commanderName;
        this.commanderRank = commanderRank;
    }

    public int getCommanderId() {
        return commanderId;
    }

    public void setCommanderId(int commanderId) {
        this.commanderId = commanderId;
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

    public List<Object> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Object> subordinates) {
        this.subordinates = subordinates;
    }

    public void addSubordinate(Object subordinate) {
        subordinates.add(subordinate);
    }

    public void removeSubordinate(Object subordinate) {
        subordinates.remove(subordinate);
    }

    @Override
    public String toString() {
        return "Commander{" +
                "commanderId=" + commanderId +
                ", commanderName='" + commanderName + '\'' +
                ", commanderRank='" + commanderRank + '\'' +
                '}';
    }
}
