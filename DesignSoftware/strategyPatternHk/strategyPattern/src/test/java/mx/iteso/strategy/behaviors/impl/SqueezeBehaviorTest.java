package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqueezeBehaviorTest {
    @Test
    public void testSqueezableSqueeze(){
        Squeezable squeezable = new Squeezable();
        assertEquals("I'm squishy!", squeezable.squeeze());
    }

    @Test
    public void testNotSqueezableSqueeze(){
        NotSqueezable notSqueezable = new NotSqueezable();
        assertEquals("I'm not squishy!", notSqueezable.squeeze());
    }
}
