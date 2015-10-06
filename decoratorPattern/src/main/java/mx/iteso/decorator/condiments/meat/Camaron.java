package mx.iteso.decorator.condiments.meat;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Camaron extends CondimentsDecorator {
    Taco taco;

    public Camaron(Taco taco){
        this.size = taco.getSize();
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camaron";
    }

    @Override
    public double cost() {
        int extra=0;
        if(taco.getSize() == MINI)
            throw new RuntimeException("Taco de Camaron no puede ser " + taco.getSize());
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
