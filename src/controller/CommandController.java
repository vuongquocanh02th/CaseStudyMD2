package controller;

import model.*;
import views.CommanderView;

public class CommandController {
    private Commander commander;
    private CommanderView commanderView;

    public CommandController(Commander commander) {
        this.commander = commander;
        this.commanderView = new CommanderView();
    }

    public void killEnemy(Enemy enemy) {
        System.out.println("Killing enemy " + enemy.getEnemyName());
        commander.gainMoney();
        commanderView.displayCommanderInfo(commander);
    }
    public void destroyBase(EnemyBase base){
        System.out.println("Destroying enemy base " + base.getBaseName());
        commander.gainMoney();
        commanderView.displayCommanderInfo(commander);
    }
}
