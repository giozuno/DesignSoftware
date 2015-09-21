package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BounceTest {
    @Test
    public void testNormalBounceBounce(){
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!", normalBounce.bounce());
    }

    @Test
    public void testIrregularBounceBounce(){
        IrregularBounce irregularBounce = new IrregularBounce();
        assertEquals("I'm bouncing irregularly!", irregularBounce.bounce());
    }
}
