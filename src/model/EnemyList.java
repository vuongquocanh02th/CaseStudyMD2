package model;

import java.util.ArrayList;
import java.util.List;

public class EnemyList {
    private List<Enemy> enemies;

    public EnemyList() {
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy(int id) {
        enemies.removeIf(enemy -> enemy.getEnemyId() == id);
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }
}
