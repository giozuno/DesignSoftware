package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by giovanni on 08/10/2015.
 */
public class PozoleBlancoTrompa extends Pozole{
    public PozoleBlancoTrompa() {
        name = "Pozole Blanco con Trompa";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
