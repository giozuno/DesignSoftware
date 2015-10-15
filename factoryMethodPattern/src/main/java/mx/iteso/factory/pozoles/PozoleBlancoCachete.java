package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by giovanni on 08/10/2015.
 */
public class PozoleBlancoCachete extends Pozole {
    public PozoleBlancoCachete() {
        name = "Pozole Blanco con Cachete";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
