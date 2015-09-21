package mx.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChristmasBallTest {
    @Test
    public void testChristmasBall() {
        ChristmasBall christmasBall = new ChristmasBall();
        assertEquals("I crashed!! I can't bounce", christmasBall.performBounce());
        assertEquals("I can't deflate!", christmasBall.performDeflate());
        assertEquals("I can't inflate!", christmasBall.performInflate());
        assertEquals("Christmas ball is rolling!", christmasBall.roll());
        assertEquals("I'm not squishy!", christmasBall.checkSqueezable());
    }
}
