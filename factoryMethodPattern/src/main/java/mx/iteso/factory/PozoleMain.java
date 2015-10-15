package mx.iteso.factory;

import mx.iteso.factory.pozoles.PozoleBlancoCachete;
import mx.iteso.factory.stores.AllPozolesStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import mx.iteso.factory.toppings.Cebolla;
import mx.iteso.factory.toppings.Oregano;
import mx.iteso.factory.toppings.Rabanos;

public class PozoleMain {
    public static void main (String[] args) {
        PozoleStore verdeStore = new PozoleVerdeStore();
        PozoleStore rojoStore = new PozoleRojoStore();
        PozoleStore menuderia = new MenudoStore();
        AllPozolesStore allStore = new AllPozolesStore();

        Pozole pozole = verdeStore.orderPozole("pollo");
        System.out.println("First order is: "+ pozole.getName());
        System.out.println();

        pozole = rojoStore.orderPozole("pollo");
        System.out.println("Second order is: "+ pozole.getName());
        System.out.println();

        pozole = menuderia.orderPozole("pollo");
        System.out.println("Third order is: "+ pozole.getName());
        System.out.println();

        pozole = allStore.createPozole("verde", "pollo");
        System.out.println("Fourth order is : "+ pozole.getName());
        System.out.println();

        Pozole pozole2 = new PozoleBlancoCachete();
        pozole2 = new Cebolla(pozole2);
        pozole2 = new Oregano(pozole2);
        pozole2 = new Rabanos(pozole2);
        System.out.println("Fifth order is : " +pozole2.getName());
    }
}