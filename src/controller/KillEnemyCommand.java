package controller;

import model.Commander;
import model.Enemy;

import java.util.ArrayList;
import java.util.List;

public class KillEnemyCommand implements Command {
    private Commander commander;
    private Enemy enemy;
    List<Enemy> enemyList = new ArrayList<>();

    public KillEnemyCommand(Commander commander, Enemy enemy) {
        this.commander = commander;
        this.enemy = enemy;
    }

    @Override
    public void execute() {
        System.out.println("Killing enemy " + enemy.getEnemyName());
        enemyList.remove(enemy);
        commander.gainMoney();
        System.out.println("Commander money after killing enemy: " + commander.getMoney());
    }
}
