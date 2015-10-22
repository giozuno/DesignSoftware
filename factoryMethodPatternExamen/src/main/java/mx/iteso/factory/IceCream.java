package mx.iteso.factory;

import java.util.ArrayList;

public abstract class IceCream {
    public String name;
    public String type;
    public ArrayList toppings = new ArrayList();


    public void serve() {
        System.out.println("Serving in regular cone..." );
    }

    public void prepare() {
        System.out.println("Preparing " + name + "(" + type + ")");
    }
    public String getName(){
        return name;
    }
}