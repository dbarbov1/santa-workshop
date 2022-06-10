package workshop.commands;

import workshop.enums.ToyType;

public class ToyCommand implements Command {
    private ToyType toyType;

    public ToyCommand(ToyType toyType){
        this.toyType = toyType;
    }

    public ToyType getToyType() {
        return toyType;
    }
}
