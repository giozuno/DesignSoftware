package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.Squeezable;

public class BasketBall extends Ball {
    public BasketBall() {
        super(new NormalBounce());
        deflateBehavior = new Deflatable();
        type = "Basket ball";
        squeezeBehavior = new Squeezable();
    }
}
