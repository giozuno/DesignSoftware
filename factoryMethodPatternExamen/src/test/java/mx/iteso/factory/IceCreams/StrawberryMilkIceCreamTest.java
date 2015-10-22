package mx.iteso.factory.IceCreams;

import mx.iteso.factory.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by giovanni on 22/10/2015.
 */
public class StrawberryMilkIceCreamTest {
    private IceCream iceCream;

    @Before
    public void SetUp(){
        iceCream = mock(IceCream.class);
    }

    @Test
    public void PropertiesTest() {
        iceCream = new StrawberryMilkIceCream();
        assertEquals(iceCream.getName(), "Nieve de Fresa");
        assertEquals(iceCream.type, "Leche");
    }
}
