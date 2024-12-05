package model;

public class Weapon {
    private int weaponId;
    private String weaponName;
    private int power;

    public Weapon(int weaponId, String weaponName, int power) {
        this.weaponId = weaponId;
        this.weaponName = weaponName;
        this.power = power;
    }

    public int getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(int weaponId) {
        this.weaponId = weaponId;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
