package model;

public class Sniper {
    private int sniperId;
    private String sniperName;
    private int yearOfExperience;
    private double sniperSalary;
    private double sniperBonus;

    public Sniper(int sniperId, String sniperName, int yearOfExperience, double sniperSalary, double sniperBonus) {
        this.sniperId = sniperId;
        this.sniperName = sniperName;
        this.yearOfExperience = yearOfExperience;
        this.sniperSalary = sniperSalary;
        this.sniperBonus = sniperBonus;
    }

    public int getSniperId() {
        return sniperId;
    }

    public void setSniperId(int sniperId) {
        this.sniperId = sniperId;
    }

    public String getSniperName() {
        return sniperName;
    }

    public void setSniperName(String sniperName) {
        this.sniperName = sniperName;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public double getSniperSalary() {
        return sniperSalary;
    }

    public void setSniperSalary(double sniperSalary) {
        this.sniperSalary = sniperSalary;
    }

    public double getSniperBonus() {
        return sniperBonus;
    }

    public void setSniperBonus(double sniperBonus) {
        this.sniperBonus = sniperBonus;
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "sniperId=" + sniperId +
                ", sniperName='" + sniperName + '\'' +
                ", yearOfExperience=" + yearOfExperience +
                ", sniperSalary=" + sniperSalary +
                ", sniperBonus=" + sniperBonus +
                '}';
    }
}
