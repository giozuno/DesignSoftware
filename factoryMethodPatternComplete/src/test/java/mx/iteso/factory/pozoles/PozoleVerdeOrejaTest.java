package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by giovanni on 14/10/2015.
 */
public class PozoleVerdeOrejaTest {
    private Pozole pozole;

    @Before
    public void SetUp() { pozole = mock((Pozole.class)); }

    @Test
    public void testProperties(){
        Pozole pozole = new PozoleVerdeOreja();
        assertEquals(pozole.getName(), "Pozole Verde con Oreja");
        assertEquals(pozole.broth, "Caldo Verde");
    }
}
