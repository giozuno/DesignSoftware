package mx.iteso.factory.stores;

import mx.iteso.factory.IceCream;
import mx.iteso.factory.IceCreamStore;
import mx.iteso.factory.IceCreams.GuavaMilkIceCream;
import mx.iteso.factory.IceCreams.MangoMilkIceCream;
import mx.iteso.factory.IceCreams.PinneapleMilkIceCream;
import mx.iteso.factory.IceCreams.StrawberryMilkIceCream;


public class MilkIceCreamStore extends IceCreamStore {

    @Override
    protected IceCream createIceCream(String flavor) {
        if (flavor.equals("Strawberry"))
            return new StrawberryMilkIceCream();
        else if (flavor.equals("Pinneaple") )
            return new PinneapleMilkIceCream();
        else if (flavor.equals("Mango"))
            return new MangoMilkIceCream();
        else if (flavor.equals("Guava") )
            return new GuavaMilkIceCream();
        else return null;
    }
}
