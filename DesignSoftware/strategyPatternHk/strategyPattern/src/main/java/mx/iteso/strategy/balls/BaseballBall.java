package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.NotSqueezable;

public class BaseballBall extends Ball {
    public BaseballBall() {
        super(new IrregularBounce());
        deflateBehavior = new NotDeflatable();
        type = "Baseball ball";
        squeezeBehavior = new NotSqueezable();
    }
}
