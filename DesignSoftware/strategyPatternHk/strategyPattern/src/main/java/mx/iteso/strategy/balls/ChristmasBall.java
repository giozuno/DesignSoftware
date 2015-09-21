package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;
import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NotSqueezable;

public class ChristmasBall extends Ball {
    public ChristmasBall() {
        super(new Crash());
        deflateBehavior = new NotDeflatable();
        type = "Christmas ball";
        squeezeBehavior = new NotSqueezable();
    }
}
