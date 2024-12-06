package model;

import java.io.*;
import java.util.*;

public class MercenaryList implements Serializable{
    private static final long serialVersionUID = 1L;
    private List<Mercenary> mercenaries;


    public MercenaryList() {
        this.mercenaries = new ArrayList<>();

    }

    public void addMercenary(Mercenary mercenary) {
        mercenaries.add(mercenary);

    }

    public void removeMercenary(int id) {
        mercenaries.removeIf(mercenary -> mercenary.getMerId() == id);

    }

    public List<Mercenary> getMercenaries() {
        return mercenaries;
    }

    public void setMercenaries(List<Mercenary> mercenaries) {
        this.mercenaries = mercenaries;
    }

}
