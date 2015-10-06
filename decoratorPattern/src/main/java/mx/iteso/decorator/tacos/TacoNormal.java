package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        this.size = size;
        description = "Taco normal";
    }

    @Override
    public double cost() {
        float extra=0;
        if(getSize() == MINI)
            extra = -1;
        else if(getSize() == REGULAR)
            extra = 0;
        else if(getSize() == MEGA)
            extra = 2;
        return 8 + extra;
    }
  /*
    @Override
    public double cost() {
        return 8.00;
    }
    */
}
