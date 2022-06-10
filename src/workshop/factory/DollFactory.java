package workshop.factory;

import workshop.toy.AbstractToy;
import workshop.toy.Doll;

public class DollFactory extends AbstractToyFactory {
    @Override
    public AbstractToy manufactureToy() {
        return new Doll();
    }
}
