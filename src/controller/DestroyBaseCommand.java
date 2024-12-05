package controller;

import model.Commander;
import model.EnemyBase;
import model.Enemy;

import java.util.ArrayList;
import java.util.List;

public class DestroyBaseCommand implements Command {
    private Commander commander;
    private EnemyBase enemyBase;
    List<EnemyBase> enemyBaseList = new ArrayList<>();

    public DestroyBaseCommand(Commander commander, EnemyBase enemyBase) {
        this.commander = commander;
        this.enemyBase = enemyBase;
    }

    @Override
    public void execute() {
        if (enemyBase.getEnemies().isEmpty()) {
            System.out.println("Destroying enemy base " + enemyBase.getBaseName());
            enemyBaseList.remove(enemyBase);
            commander.gainMoney();
            System.out.println("Commander money after destroying base: " + commander.getMoney());
        } else {
            System.out.println("You must remove all enemies from the base before destroying it.");
        }
    }
}
