package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VolcanTest {
    @Test
    public void testCost() {
        Taco taco = new Volcan();
        assertEquals(10.0, taco.cost(),0);
    }
    @Test
    public void testDescription() {
        Taco taco = new Volcan();
        assertEquals("Volcan Regular", taco.getDescription()+ " " + taco.getSize());
    }
}
