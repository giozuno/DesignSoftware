package mx.iteso.factory;

import mx.iteso.factory.stores.MilkIceCreamStore;
import mx.iteso.factory.stores.WaterIceCreamStore;

public class IceCreamMain {
    public static void main (String[] args) {
        IceCreamStore milkStore = new MilkIceCreamStore();
        IceCreamStore waterStore = new WaterIceCreamStore();

        IceCream iceCream = milkStore.orderIceCream("Strawberry");
        System.out.println("First Order is: " + iceCream.getName());
        System.out.println();

        iceCream = milkStore.orderIceCream("Pinneaple");
        System.out.println("Second Order is: " + iceCream.getName());
        System.out.println();

        iceCream = milkStore.orderIceCream("Guava");
        System.out.println("Third Order is: " + iceCream.getName());
        System.out.println();

        iceCream = waterStore.orderIceCream("Mango");
        System.out.println("Fourth Order is: " + iceCream.getName());
        System.out.println();

        iceCream = waterStore.orderIceCream("Pinneaple");
        System.out.println("Fifth Order is: " + iceCream.getName());
    }
}