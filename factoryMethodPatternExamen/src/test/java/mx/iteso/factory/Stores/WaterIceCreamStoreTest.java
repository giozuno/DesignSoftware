package mx.iteso.factory.Stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.IceCreams.MangoWaterIceCream;
import mx.iteso.factory.stores.WaterIceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * Created by giovanni on 22/10/2015.
 */
public class WaterIceCreamStoreTest {
    private IceCreamStore iceCreamStore;

    @Before
    public void SetUp() {
        iceCreamStore = mock(IceCreamStore.class);
    }

    @Test
    public void CreateTest() {
        IceCream mangoIceCream = new MangoWaterIceCream();
        iceCreamStore = new WaterIceCreamStore();
        IceCream iceCream = iceCreamStore.orderIceCream("Mango");
        assertEquals(mangoIceCream.getName(), iceCream.getName());
    }
}
