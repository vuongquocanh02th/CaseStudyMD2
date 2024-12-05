package model;

import java.util.ArrayList;
import java.util.List;

public class EnemyBase {
    private int baseId;
    private String baseName;
    private List<Enemy> enemies;

    public EnemyBase(int baseId, String baseName) {
        this.baseId = baseId;
        this.baseName = baseName;
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }
    public void removeEnemy(Enemy enemy){
        enemies.remove(enemy);
    }

    public int getBaseId() {
        return baseId;
    }

    public void setBaseId(int baseId) {
        this.baseId = baseId;
    }

    public String getBaseName() {
        return baseName;
    }

    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }
}
