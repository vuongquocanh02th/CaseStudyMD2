package model;
import java.io.*;
import java.util.*;

public class CommanderList {
    private List<Commander> commanders;


    public CommanderList() {
        this.commanders = new ArrayList<>();

    }

    public void addCommander(Commander commander) {
        commanders.add(commander);

    }

    public void removeCommander(int id) {
        commanders.removeIf(commander -> commander.getCommanderID() == id);

    }

    public List<Commander> getCommanders() {
        return commanders;
    }

    public void setCommanders(List<Commander> commanders) {
        this.commanders = commanders;
    }
}
