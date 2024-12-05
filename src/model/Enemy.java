package model;

public class Enemy {
    private int enemyId;
    private String enemyName;

    public Enemy(int enemyId, String enemyName) {
        this.enemyId = enemyId;
        this.enemyName = enemyName;
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

}
