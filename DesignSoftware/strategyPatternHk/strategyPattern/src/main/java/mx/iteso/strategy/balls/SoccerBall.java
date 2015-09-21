package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.Squeezable;

public class SoccerBall extends Ball {
    public SoccerBall() {
        super(new NormalBounce());
        deflateBehavior = new Deflatable();
        type = "Soccer ball";
        squeezeBehavior = new Squeezable();
    }
}
