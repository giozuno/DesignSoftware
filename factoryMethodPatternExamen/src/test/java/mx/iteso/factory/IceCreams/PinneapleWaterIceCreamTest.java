package mx.iteso.factory.IceCreams;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by giovanni on 22/10/2015.
 */
public class PinneapleWaterIceCreamTest {
    private IceCream iceCream;

    @Before
    public void SetUp() {
        iceCream = mock(IceCream.class);
    }

    @Test
    public void PropertiesTest() {
        iceCream = new PinneapleWaterIceCream();
        assertEquals(iceCream.getName(), "Nieve de Pina");
        assertEquals(iceCream.type, "Agua");
    }
}
