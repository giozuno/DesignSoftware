package mx.iteso.strategy.balls;

import mx.iteso.strategy.Ball;
import mx.iteso.strategy.behaviors.impl.Deflatable;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import mx.iteso.strategy.behaviors.impl.Squeezable;

public class VolleyBall extends Ball {
    public VolleyBall() {
        super(new NormalBounce());
        deflateBehavior = new Deflatable();
        type = "Volley ball";
        squeezeBehavior = new Squeezable();
    }
}
