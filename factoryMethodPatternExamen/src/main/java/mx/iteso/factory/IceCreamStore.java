package mx.iteso.factory;

public abstract class IceCreamStore {

    public IceCream orderIceCream(String flavor){
        IceCream iceCream;

        iceCream = createIceCream(flavor);

        iceCream.prepare();
        iceCream.serve();

        return iceCream;
    }

    protected abstract IceCream createIceCream(String flavor);
}