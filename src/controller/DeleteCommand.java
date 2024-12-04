package controller;

import model.Commander;

public class DeleteCommand implements Command{
    private Commander commander;
    private Object model;
    public DeleteCommand(Commander commander, Object model) {
        this.commander = commander;
        this.model = model;
    }

    @Override
    public void execute() {
        commander.removeSubordinate(model);
    }
}
