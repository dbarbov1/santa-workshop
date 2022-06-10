package dilyan;

import workshop.Santa;
import workshop.Workshop;
import workshop.commands.ToyCommand;
import workshop.enums.ToyType;
import workshop.magic.MagicBoard;
import workshop.workers.DwarfWorker;

public class Main {

    public static void main(String[] args) {
        // init the workers, setting the types of toys each worker can manufacture
        DwarfWorker worker1 = new DwarfWorker(ToyType.Bicycle);
        DwarfWorker worker2 = new DwarfWorker(ToyType.Bicycle, ToyType.Doll);
        DwarfWorker worker3 = new DwarfWorker(ToyType.Doll);

        // magic board and adding workers observing it
        MagicBoard magicBoard = new MagicBoard();
        magicBoard.workerList.add(worker1);
        magicBoard.workerList.add(worker2);
        magicBoard.workerList.add(worker3);
        Workshop workshop = new Workshop(magicBoard);

        Santa santa = workshop.getSanta();

        // santa orders a toy by the means of a Command which holds what type of toy to be made
        santa.orderToy(new ToyCommand(ToyType.Bicycle));
        santa.orderToy(new ToyCommand(ToyType.Doll));
    }
}
