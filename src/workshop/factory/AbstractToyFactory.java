package workshop.factory;

import workshop.enums.ToyType;
import workshop.toy.AbstractToy;

public abstract class AbstractToyFactory {
    public abstract AbstractToy manufactureToy();
}
