package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String size){
        this.size = size;
        description = "Quesadilla";
    }

    @Override
    public double cost() {
        int extra=0;
        if(getSize() == MINI)
            extra = -1;
        if(getSize() == REGULAR)
            extra = 0;
        else if(getSize() == MEGA)
            extra = 2;
        return extra + 10;
    }
    /*
    @Override
    public double cost() {
        return 10.00;
    }
    */
}
