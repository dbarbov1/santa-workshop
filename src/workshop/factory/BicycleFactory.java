package workshop.factory;

import workshop.toy.AbstractToy;
import workshop.toy.Bicycle;

public class BicycleFactory extends AbstractToyFactory {
    @Override
    public AbstractToy manufactureToy() {
        return new Bicycle();
    }
}
