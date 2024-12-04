package model;

public class Commander {
    private int commanderID;
    private String commanderName;
    private String commanderRank;

    public Commander(int commanderID, String commanderName, String commanderRank) {
        this.commanderID = commanderID;
        this.commanderName = commanderName;
        this.commanderRank = commanderRank;
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


    @Override
    public String toString() {
        return "Commander{" +
                "commanderID=" + commanderID +
                ", commanderName='" + commanderName + '\'' +
                ", commanderRank='" + commanderRank + '\'' +
                '}';
    }
}
