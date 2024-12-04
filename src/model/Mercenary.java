package model;

import java.io.Serializable;

public class Mercenary implements Serializable {
    private int merId;
    private String merName;
    private int merPower;
    private double merSalary;
    private String merWeapon;

    public Mercenary(int merId, String merName, int merPower, double merSalary, String merWeapon) {
        this.merId = merId;
        this.merName = merName;
        this.merPower = merPower;
        this.merSalary = merSalary;
        this.merWeapon = merWeapon;
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

    public int getMerPower() {
        return merPower;
    }

    public void setMerPower(int merPower) {
        this.merPower = merPower;
    }

    public double getMerSalary() {
        return merSalary;
    }

    public void setMerSalary(double merSalary) {
        this.merSalary = merSalary;
    }

    public String getMerWeapon() {
        return merWeapon;
    }

    public void setMerWeapon(String merWeapon) {
        this.merWeapon = merWeapon;
    }

    @Override
    public String toString() {
        return "Mercenary{" +
                "merId=" + merId +
                ", merName='" + merName + '\'' +
                ", merPower=" + merPower +
                ", merSalary=" + merSalary +
                ", merWeapon='" + merWeapon + '\'' +
                '}';
    }
}
