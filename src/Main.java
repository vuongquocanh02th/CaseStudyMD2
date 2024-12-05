import controller.*;
import model.*;
import views.*;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Commander commander = new Commander(1, "John", "General");
        Mercenary mercenary = new Mercenary(1, "Jack", "Infantry", 5000, "John", "AK47", "Tank");

        commander.addMercenary(mercenary);

        CommandController commandController = new CommandController(commander);
        EnemyBase base = new EnemyBase(1, "Base Alpha");
        Enemy enemy = new Enemy(1, "Enemy A", "Base Alpha");

        base.addEnemy(enemy);
        commandController.killEnemy(enemy);
        commandController.destroyBase(base);
    }
}