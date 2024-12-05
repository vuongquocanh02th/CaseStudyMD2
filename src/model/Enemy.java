package model;

public class Enemy {
    private int enemyId;
    private String enemyName;
    private String baseName;

    public Enemy(int enemyId, String enemyName, String baseName) {
        this.enemyId = enemyId;
        this.enemyName = enemyName;
        this.baseName = baseName;
    }

    public int getEnemyId() {
        return enemyId;
    }

    public void setEnemyId(int enemyId) {
        this.enemyId = enemyId;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }
}
