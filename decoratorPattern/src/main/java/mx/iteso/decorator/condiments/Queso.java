package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.size = taco.getSize();
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
    }

    @Override
    public double cost() {
        int extra=0;
        if(taco.getSize() == MINI)
            extra = 1;
        else if(taco.getSize() == REGULAR)
            extra = 2;
        else if (taco.getSize() == MEGA)
            extra = 4;
        return extra + taco.cost();
    }
    /*
    @Override
    public double cost() {
        return 2.00 + taco.cost();
    }
    */
}
