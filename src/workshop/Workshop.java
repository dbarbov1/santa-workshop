package workshop;

import workshop.magic.Magic;
import workshop.magic.MagicBoard;

public class Workshop {
    private static Santa santa;
    private MagicBoard magicBoard;

    public Workshop(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    public Santa getSanta() {
        if (santa == null) {
            santa = new Santa(magicBoard);
        }

        return santa;
    }


    public MagicBoard getMagicBoard() {
        return magicBoard;
    }
}
