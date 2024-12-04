package controller;

import model.Commander;
//Them model
public class AddCommand implements Command {
    private Commander commander;
    private Object model;

    public AddCommand(Commander commander, Object model) {
        this.commander = commander;
        this.model = model;
    }

    @Override
    public void execute() {
        commander.addSubordinate(model);
    }
}
