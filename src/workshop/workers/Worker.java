package workshop.workers;

import workshop.commands.Command;

import java.util.List;

public interface Worker {
    void work(Command command);
}
