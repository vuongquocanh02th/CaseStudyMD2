package model;

public class AirForce {
    private int airForceID;
    private String airForceName;
    private String airForceVehicle;
    private double airForceSalary;
    private double airForceBonus;

    public AirForce(int airForceID, String airForceName, String airForceVehicle, double airForceSalary, double airForceBonus) {
        this.airForceID = airForceID;
        this.airForceName = airForceName;
        this.airForceVehicle = airForceVehicle;
        this.airForceSalary = airForceSalary;
        this.airForceBonus = airForceBonus;
    }

    public int getAirForceID() {
        return airForceID;
    }

    public void setAirForceID(int airForceID) {
        this.airForceID = airForceID;
    }

    public String getAirForceName() {
        return airForceName;
    }

    public void setAirForceName(String airForceName) {
        this.airForceName = airForceName;
    }

    public String getAirForceVehicle() {
        return airForceVehicle;
    }

    public void setAirForceVehicle(String airForceVehicle) {
        this.airForceVehicle = airForceVehicle;
    }

    public double getAirForceSalary() {
        return airForceSalary;
    }

    public void setAirForceSalary(double airForceSalary) {
        this.airForceSalary = airForceSalary;
    }

    public double getAirForceBonus() {
        return airForceBonus;
    }

    public void setAirForceBonus(double airForceBonus) {
        this.airForceBonus = airForceBonus;
    }

    @Override
    public String toString() {
        return "AirForce{" +
                "airForceID=" + airForceID +
                ", airForceName='" + airForceName + '\'' +
                ", airForceVehicle='" + airForceVehicle + '\'' +
                ", airForceSalary=" + airForceSalary +
                ", airForceBonus=" + airForceBonus +
                '}';
    }
}
