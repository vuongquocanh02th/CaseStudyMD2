package controller;

import model.Commander;

public class ProxyCommand implements Command {
    private Commander commander;

    public ProxyCommand(Commander commander) {
        this.commander = commander;
    }

    @Override
    public void execute() {
        System.out.println("Executing command for Commander: " + commander.getCommanderName());
    }
}
