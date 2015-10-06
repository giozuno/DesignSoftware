package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

/**
 * Created by giovanni on 01/10/2015.
 */
public class Volcan extends Taco {
    public Volcan() {
        size = REGULAR;
        description = "Volcan";
    }

    @Override
    public double cost() {
        return 10;
    }
}
