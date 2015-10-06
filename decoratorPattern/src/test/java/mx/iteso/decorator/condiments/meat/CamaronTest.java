package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CamaronTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testCostRegular(){
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = camaron.cost();
        assertEquals(10.0, cost,0);
    }

    @Test
    public void testCostMega(){
        Taco camaron = new Camaron(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = camaron.cost();
        assertEquals(12.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco camaron = new Camaron(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        when(taco.getSize()).thenReturn("mega");
        String desc = camaron.getDescription();
        assertEquals("Taco Normal de camaron", desc);
    }
    @Test (expected = RuntimeException.class)
    public void testCostException(){
        Taco camaron = new Camaron(taco);
        when(taco.getSize()).thenReturn(taco.MINI);
        assertEquals(8.0, camaron.cost(), 0);
    }
}
