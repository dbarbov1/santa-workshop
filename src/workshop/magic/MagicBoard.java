package workshop.magic;

import workshop.commands.Command;
import workshop.workers.Worker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicBoard implements Magic {
    public List<Command> commandList = new ArrayList<>();
    public List<Worker> workerList = new ArrayList<>();

    @Override
    public void dispatchCommand(Command command) {
        this.commandList.add(command);
        this.notifyWorkers(command);
    }

    /**
     * Notify dwarf watching the magic board
     * @param command
     */
    private void notifyWorkers(Command command) {
        for (Worker worker :
                workerList) {
            worker.work(command);
        }
    }

}
