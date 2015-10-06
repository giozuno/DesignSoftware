package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {
    @Test
    public void testMiniCost() {
        Taco taco = new TacoNormal(Taco.MINI);
        assertEquals(7.0, taco.cost(),0);
    }
    @Test
    public void tesRegularCost() {
        Taco taco = new TacoNormal(Taco.REGULAR);
        assertEquals(8.0, taco.cost(),0);
    }
    @Test
    public void testMegaCost() {
        Taco taco = new TacoNormal(Taco.MEGA);
        assertEquals(10.0, taco.cost(),0);
    }
    @Test
    public void testDescription() {
        Taco taco = new TacoNormal(Taco.MINI);
        assertEquals("Taco normal Mini", taco.getDescription()+ " " + taco.getSize());
    }
}
