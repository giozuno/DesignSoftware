package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.PozolilloPollo;

/**
 * Created by giovanni on 08/10/2015.
 */
public class PozolilloStore extends PozoleStore {
    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new PozolilloPollo();
        return pozole;
    }
}
