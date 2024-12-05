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
        Command killEnemyCommand = new KillEnemyCommand(commander, enemy);
        killEnemyCommand.execute();
    }
    public void destroyBase(EnemyBase base){
        Command destroyBaseCommand = new DestroyBaseCommand(commander, base);
        destroyBaseCommand.execute();
    }
}
