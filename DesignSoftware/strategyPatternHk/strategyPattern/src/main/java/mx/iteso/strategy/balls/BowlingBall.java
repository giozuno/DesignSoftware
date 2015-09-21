package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NotSqueezable;

public class BowlingBall extends Ball {
    public BowlingBall() {
        super(new IrregularBounce());
        deflateBehavior = new NotDeflatable();
        type = "Bowling ball";
        squeezeBehavior = new NotSqueezable();
    }
}
