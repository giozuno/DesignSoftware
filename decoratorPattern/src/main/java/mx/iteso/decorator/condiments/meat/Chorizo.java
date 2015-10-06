package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Chorizo extends CondimentsDecorator {
    Taco taco;

    public Chorizo(Taco taco){
        this.size = taco.getSize();
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de chorizo";
    }

    @Override
    public double cost() {
        int extra=0;
        if(taco.getSize() == MINI)
            extra = -1;
        else if(taco.getSize() == REGULAR)
            extra = 0;
        else if (taco.getSize() == MEGA)
            extra = 2;
        return extra + taco.cost();
    }

    /*
    @Override
    public double cost() {
        return 0 + taco.cost();
    }
    */
}
