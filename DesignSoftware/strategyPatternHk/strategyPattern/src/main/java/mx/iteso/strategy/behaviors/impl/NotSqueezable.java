package mx.iteso.strategy.behaviors.impl;


import mx.iteso.strategy.behaviors.SqueezeBehavior;

public class NotSqueezable implements SqueezeBehavior {

    public String squeeze() {
        return "I'm not squishy!";
    }

}
