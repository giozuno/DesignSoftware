package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolleyBallTest {
    @Test
    public void testVolleyBall() {
        VolleyBall volleyBall = new VolleyBall();
        assertEquals("I'm bouncing normally!", volleyBall.performBounce());
        assertEquals("I'm deflating!", volleyBall.performDeflate());
        assertEquals("I'm inflating!", volleyBall.performInflate());
        assertEquals("Volley ball is rolling!", volleyBall.roll());
        assertEquals("I'm squishy!", volleyBall.checkSqueezable());
    }
}
