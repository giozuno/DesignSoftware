package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Pescado extends CondimentsDecorator {
    Taco taco;

    public Pescado(Taco taco){
        this.size = taco.getSize();
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        int extra=0;
        if(taco.getSize() == MINI)
            throw new RuntimeException("Taco de Pescado no puede ser Mini");
        else if(taco.getSize() == REGULAR)
            extra = 2;
        else if (taco.getSize() == MEGA)
            extra = 4;
        return extra + taco.cost();
    }

    /*
    @Override
    public double cost() {
        return 0 + taco.cost();
    }
    */
}
