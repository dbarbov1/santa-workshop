package workshop;

import workshop.commands.Command;
import workshop.magic.Magic;

public class Santa {
    private Magic magic;

    public Santa(Magic magic){
        this.magic = magic;
    }

    /**
     * Santa says the magic words
     * He does not know how his workers get his message
     * @param command
     */
    public void orderToy(Command command){
        this.magic.dispatchCommand(command);
    }
}
