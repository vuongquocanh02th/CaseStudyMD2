package model;

public class Navy {
    private int navyId;
    private String navyName;
    private String navySkill;
    private double navySalary;
    private double navyBonus;

    public Navy(int navyId, String navyName, String navySkill, double navySalary, double navyBonus) {
        this.navyId = navyId;
        this.navyName = navyName;
        this.navySkill = navySkill;
        this.navySalary = navySalary;
        this.navyBonus = navyBonus;
    }

    public int getNavyId() {
        return navyId;
    }

    public void setNavyId(int navyId) {
        this.navyId = navyId;
    }

    public String getNavyName() {
        return navyName;
    }

    public void setNavyName(String navyName) {
        this.navyName = navyName;
    }

    public String getNavySkill() {
        return navySkill;
    }

    public void setNavySkill(String navySkill) {
        this.navySkill = navySkill;
    }

    public double getNavySalary() {
        return navySalary;
    }

    public void setNavySalary(double navySalary) {
        this.navySalary = navySalary;
    }

    public double getNavyBonus() {
        return navyBonus;
    }

    public void setNavyBonus(double navyBonus) {
        this.navyBonus = navyBonus;
    }

    @Override
    public String toString() {
        return "Navy{" +
                "navyId=" + navyId +
                ", navyName='" + navyName + '\'' +
                ", navySkill='" + navySkill + '\'' +
                ", navySalary=" + navySalary +
                ", navyBonus=" + navyBonus +
                '}';
    }
}
