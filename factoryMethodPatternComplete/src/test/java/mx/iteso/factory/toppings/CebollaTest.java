package mx.iteso.factory.toppings;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by giovanni on 14/10/2015.
 */
public class CebollaTest {
    private Pozole pozole;

    @Before
    public void SetUp() { pozole = mock((Pozole.class)); }

    @Test
    public void testDescription(){
        Pozole cebolla = new Cebolla(pozole);
        when(pozole.getName()).thenReturn("Pozole");
        String desc = cebolla.getName();
        assertEquals("Pozole con cebolla", desc);
    }
}
