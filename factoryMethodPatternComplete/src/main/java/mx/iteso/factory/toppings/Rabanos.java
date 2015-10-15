package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.ToppingsDecorator;

/**
 * Created by giovanni on 14/10/2015.
 */
public class Rabanos extends ToppingsDecorator {
    Pozole pozole;
    public Rabanos(Pozole p) {
        pozole = p;
    }

    @Override
    public String getName() {
        return pozole.getName() + " con rabanos";
    }
}
