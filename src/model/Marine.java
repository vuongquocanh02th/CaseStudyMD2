package model;

public class Marine {
    private int marineId;
    private String marineName;
    private String marineWeapon;
    private int marineAmor;
    private double marineSalary;
    private double marineBonus;

    public Marine(int marineId, String marineName, String marineWeapon, int marineAmor, double marineSalary, double marineBonus) {
        this.marineId = marineId;
        this.marineName = marineName;
        this.marineWeapon = marineWeapon;
        this.marineAmor = marineAmor;
        this.marineSalary = marineSalary;
        this.marineBonus = marineBonus;
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

    public String getMarineWeapon() {
        return marineWeapon;
    }

    public void setMarineWeapon(String marineWeapon) {
        this.marineWeapon = marineWeapon;
    }

    public int getMarineAmor() {
        return marineAmor;
    }

    public void setMarineAmor(int marineAmor) {
        this.marineAmor = marineAmor;
    }

    public double getMarineSalary() {
        return marineSalary;
    }

    public void setMarineSalary(double marineSalary) {
        this.marineSalary = marineSalary;
    }

    public double getMarineBonus() {
        return marineBonus;
    }

    public void setMarineBonus(double marineBonus) {
        this.marineBonus = marineBonus;
    }
}
