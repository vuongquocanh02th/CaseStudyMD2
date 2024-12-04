package model;

public class Sniper {
    private int sniperId;
    private String sniperName;
    private int sniperPower;
    private double sniperSalary;
    private String sniperWeapon;

    public Sniper(int sniperId, String sniperName, int sniperPower, double sniperSalary, String sniperWeapon) {
        this.sniperId = sniperId;
        this.sniperName = sniperName;
        this.sniperPower = sniperPower;
        this.sniperSalary = sniperSalary;
        this.sniperWeapon = sniperWeapon;
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

    public int getSniperPower() {
        return sniperPower;
    }

    public void setSniperPower(int sniperPower) {
        this.sniperPower = sniperPower;
    }

    public double getSniperSalary() {
        return sniperSalary;
    }

    public void setSniperSalary(double sniperSalary) {
        this.sniperSalary = sniperSalary;
    }

    public String getSniperWeapon() {
        return sniperWeapon;
    }

    public void setSniperWeapon(String sniperWeapon) {
        this.sniperWeapon = sniperWeapon;
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "sniperId=" + sniperId +
                ", sniperName='" + sniperName + '\'' +
                ", sniperPower=" + sniperPower +
                ", sniperSalary=" + sniperSalary +
                ", sniperWeapon='" + sniperWeapon + '\'' +
                '}';
    }
}
