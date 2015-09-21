package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.Squeezable;

public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        super(new IrregularBounce());
        deflateBehavior = new Deflatable();
        type = "American Football ball";
        squeezeBehavior = new Squeezable();
    }
}
