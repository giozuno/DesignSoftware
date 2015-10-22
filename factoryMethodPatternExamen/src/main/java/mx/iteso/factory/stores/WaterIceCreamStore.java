package mx.iteso.factory.stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.IceCreams.GuavaWaterIceCream;
import mx.iteso.factory.IceCreams.MangoWaterIceCream;
import mx.iteso.factory.IceCreams.PinneapleWaterIceCream;
import mx.iteso.factory.IceCreams.StrawberryWaterIceCream;

public class WaterIceCreamStore extends IceCreamStore {

    @Override
    protected IceCream createIceCream(String flavor) {
        if (flavor.equals("Strawberry"))
            return new StrawberryWaterIceCream();
        else if (flavor.equals("Pinneaple") )
            return new PinneapleWaterIceCream();
        else if (flavor.equals("Mango"))
            return new MangoWaterIceCream();
        else if (flavor.equals("Guava") )
            return new GuavaWaterIceCream();
        else return null;
    }
}
