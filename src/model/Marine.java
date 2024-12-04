package model;

import java.io.Serializable;

public class Marine implements Serializable {
    private int marineId;
    private String marineName;
    private int marinePower;
    private double marineSalary;
    private String marineWeapon;

    public Marine(int marineId, String marineName, int marinePower, double marineSalary, String marineWeapon) {
        this.marineId = marineId;
        this.marineName = marineName;
        this.marinePower = marinePower;
        this.marineSalary = marineSalary;
        this.marineWeapon = marineWeapon;
    }

    public int getMarineId() {
        return marineId;
    }

    public void setMarineId(int marineId) {
        this.marineId = marineId;
    }

    public String getMarineName() {
        return marineName;
    }

    public void setMarineName(String marineName) {
        this.marineName = marineName;
    }

    public int getMarinePower() {
        return marinePower;
    }

    public void setMarinePower(int marinePower) {
        this.marinePower = marinePower;
    }

    public double getMarineSalary() {
        return marineSalary;
    }

    public void setMarineSalary(double marineSalary) {
        this.marineSalary = marineSalary;
    }

    public String getMarineWeapon() {
        return marineWeapon;
    }

    public void setMarineWeapon(String marineWeapon) {
        this.marineWeapon = marineWeapon;
    }

    @Override
    public String toString() {
        return "Marine{" +
                "marineId=" + marineId +
                ", marineName='" + marineName + '\'' +
                ", marinePower=" + marinePower +
                ", marineSalary=" + marineSalary +
                ", marineWeapon='" + marineWeapon + '\'' +
                '}';
    }
}
