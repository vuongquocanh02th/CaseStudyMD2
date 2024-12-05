package model;

public class Vehicle {
    private int vehiceId;
    private String vehicleName;
    private int armor;

    public Vehicle(int vehiceId, String vehicleName, int armor) {
        this.vehiceId = vehiceId;
        this.vehicleName = vehicleName;
        this.armor = armor;
    }

    public int getVehiceId() {
        return vehiceId;
    }

    public void setVehiceId(int vehiceId) {
        this.vehiceId = vehiceId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
