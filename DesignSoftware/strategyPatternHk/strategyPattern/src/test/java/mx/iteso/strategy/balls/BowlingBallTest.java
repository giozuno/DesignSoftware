package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingBallTest {
    @Test
    public void testBowlingBall() {
        BowlingBall bowlingBall = new BowlingBall();
        assertEquals("I'm bouncing irregularly!", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("Bowling ball is rolling!", bowlingBall.roll());
        assertEquals("I'm not squishy!", bowlingBall.checkSqueezable());
    }
}
