package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasketBallTest {
    @Test
    public void testBasketBall() {
        BasketBall basketBall = new BasketBall();
        assertEquals("I'm bouncing normally!", basketBall.performBounce());
        assertEquals("I'm deflating!", basketBall.performDeflate());
        assertEquals("I'm inflating!", basketBall.performInflate());
        assertEquals("Basket ball is rolling!", basketBall.roll());
        assertEquals("I'm squishy!", basketBall.checkSqueezable());
    }
}
