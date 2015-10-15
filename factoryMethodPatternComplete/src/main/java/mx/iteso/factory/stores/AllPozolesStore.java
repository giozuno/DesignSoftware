package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;

/**
 * Created by giovanni on 08/10/2015.
 */
public class AllPozolesStore {
    public Pozole createPozole(String type, String meat) {
        Pozole pozole = null;
        if (type.equals("rojo")){
            PozoleStore store = new PozoleRojoStore();
            pozole = store.orderPozole(meat);
        }
        else if (type.equals("verde")){
            PozoleStore store = new PozoleVerdeStore();
            pozole = store.orderPozole(meat);
        }
        else if (type.equals("blanco")){
            PozoleStore store = new PozoleBlancoStore();
            pozole = store.orderPozole(meat);
        }
        else if (type.equals("pozolillo")){
            PozoleStore store = new PozolilloStore();
            pozole = store.orderPozole(meat);
        }
        else if (type.equals("menudo")){
            PozoleStore store = new MenudoStore();
            pozole = store.orderPozole(meat);
        }
        return pozole;
    }
}
