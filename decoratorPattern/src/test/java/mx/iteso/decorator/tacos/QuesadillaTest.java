package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuesadillaTest {
    @Test
    public void testMiniCost() {
        Taco quesadilla = new Quesadilla(Taco.MINI);
        assertEquals(9.0, quesadilla.cost(),0);
    }
    @Test
    public void tesRegularCost() {
        Taco quesadilla = new Quesadilla(Taco.REGULAR);
        assertEquals(10.0, quesadilla.cost(),0);
    }
    @Test
    public void testMegaCost() {
        Taco quesadilla = new Quesadilla(Taco.MEGA);
        assertEquals(12.0, quesadilla.cost(),0);
    }
    @Test
    public void testDescription() {
        Taco quesadilla = new Quesadilla(Taco.MINI);
        assertEquals("Quesadilla Mini", quesadilla.getDescription()+" "+quesadilla.getSize());
    }
}
