package model;

import java.io.Serializable;

public class Mercenary implements Serializable {
    private int merId;
    private String merName;
    private String unit;
    private double hirePrice;
    private String commanderName;
    private String weaponName;
    private String vehicleName;

    public Mercenary(int merId, String merName, String unit, double hirePrice, String commanderName, String weaponName, String vehicleName) {
        this.merId = merId;
        this.merName = merName;
        this.unit = unit;
        this.hirePrice = hirePrice;
        this.commanderName = commanderName;
        this.weaponName = weaponName;
        this.vehicleName = vehicleName;
    }

    public int getMerId() {
        return merId;
    }

    public void setMerId(int merId) {
        this.merId = merId;
    }

    public String getMerName() {
        return merName;
    }

    public void setMerName(String merName) {
        this.merName = merName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getHirePrice() {
        return hirePrice;
    }

    public void setHirePrice(double hirePrice) {
        this.hirePrice = hirePrice;
    }

    public String getCommanderName() {
        return commanderName;
    }

    public void setCommanderName(String commanderName) {
        this.commanderName = commanderName;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
