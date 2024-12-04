package model;

public class AirForce {
    private int airId;
    private String airName;
    private int airPower;
    private double airSalary;
    private String airWeapon;

    public AirForce(int airId, String airName, int airPower, double airSalary, String airWeapon) {
        this.airId = airId;
        this.airName = airName;
        this.airPower = airPower;
        this.airSalary = airSalary;
        this.airWeapon = airWeapon;
    }

    public int getAirId() {
        return airId;
    }

    public void setAirId(int airId) {
        this.airId = airId;
    }

    public String getAirName() {
        return airName;
    }

    public void setAirName(String airName) {
        this.airName = airName;
    }

    public int getAirPower() {
        return airPower;
    }

    public void setAirPower(int airPower) {
        this.airPower = airPower;
    }

    public double getAirSalary() {
        return airSalary;
    }

    public void setAirSalary(double airSalary) {
        this.airSalary = airSalary;
    }

    public String getAirWeapon() {
        return airWeapon;
    }

    public void setAirWeapon(String airWeapon) {
        this.airWeapon = airWeapon;
    }

    @Override
    public String toString() {
        return "AirForce{" +
                "airId=" + airId +
                ", airName='" + airName + '\'' +
                ", airPower=" + airPower +
                ", airSalary=" + airSalary +
                ", airWeapon='" + airWeapon + '\'' +
                '}';
    }
}
