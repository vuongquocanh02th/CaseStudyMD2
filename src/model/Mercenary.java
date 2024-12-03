package model;

import java.io.*;
import java.util.*;

public class Mercenary {
    private int merId;
    private String merName;
    private int merAge;
    private double merSalary;
    private double merBonus;

    public Mercenary(int merId, String merName, int merAge, double merSalary, double merBonus) {
        this.merId = merId;
        this.merName = merName;
        this.merAge = merAge;
        this.merSalary = merSalary;
        this.merBonus = merBonus;
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

    public int getMerAge() {
        return merAge;
    }

    public void setMerAge(int merAge) {
        this.merAge = merAge;
    }

    public double getMerSalary() {
        return merSalary;
    }

    public void setMerSalary(double merSalary) {
        this.merSalary = merSalary;
    }

    public double getMerBonus() {
        return merBonus;
    }

    public void setMerBonus(double merBonus) {
        this.merBonus = merBonus;
    }

    @Override
    public String toString() {
        return "Id: " + merId + ", Name: " + merName + ", Age: " + merAge + ", Salary: " + merSalary + ", Bonus: " + merBonus;
    }
}
