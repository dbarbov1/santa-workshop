package workshop.workers;

import workshop.commands.Command;
import workshop.enums.ToyType;
import workshop.factory.AbstractToyFactory;
import workshop.factory.BicycleFactory;
import workshop.factory.DollFactory;
import workshop.toy.AbstractToy;

import java.util.Arrays;
import java.util.EnumSet;


public class DwarfWorker implements Worker {
    private ToyType[] toyTypes;

    public DwarfWorker(ToyType... toyTypes) {
        this.toyTypes = toyTypes;
    }

    /**
     * Check if worker can manufacture toys of the requested type
     * @param command
     */
    @Override
    public void work(Command command) {
        if (Arrays.asList(toyTypes).contains(command.getToyType())) {
            AbstractToyFactory factory = this.getToyFactory(command.getToyType());

            if (factory != null) {
                AbstractToy toy = factory.manufactureToy();

                // usually bad practice, but too much overhead to implement a full blown logging system
                System.out.println("New toy created  - " + toy.getClass());
            }
        }
    }

    private AbstractToyFactory getToyFactory(ToyType toyType) {
        switch (toyType) {
            case Doll:
                return new DollFactory();
            case Bicycle:
                return new BicycleFactory();
            default:
                return null;
        }
    }
}
