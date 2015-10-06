package mx.iteso.decorator.condiments;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class QuesoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testMiniCost(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = queso.cost();
        assertEquals(9.0, cost,0);
    }
    @Test
    public void testRegularCost(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = queso.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void testMegaCost(){
        Taco queso = new Queso(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = queso.cost();
        assertEquals(12.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco queso = new Queso(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = queso.getDescription();
        assertEquals("Taco Normal con queso", desc);
    }
}
