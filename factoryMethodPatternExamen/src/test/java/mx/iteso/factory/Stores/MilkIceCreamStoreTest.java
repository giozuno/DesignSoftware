package mx.iteso.factory.Stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.IceCreams.StrawberryMilkIceCream;
import mx.iteso.factory.stores.MilkIceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by giovanni on 22/10/2015.
 */
public class MilkIceCreamStoreTest {
    private IceCreamStore iceCreamStore;

    @Before
    public void SetUp() {
        iceCreamStore = mock(IceCreamStore.class);
    }

    @Test
    public void createTest() {
        IceCream strawberryIceCream = new StrawberryMilkIceCream();
        iceCreamStore = new MilkIceCreamStore();
        IceCream iceCream = iceCreamStore.orderIceCream("Strawberry");
        assertSame(strawberryIceCream.getName(), iceCream.getName());
    }
}
