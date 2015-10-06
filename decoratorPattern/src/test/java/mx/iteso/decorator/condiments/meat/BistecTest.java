package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.Taco;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BistecTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }

    @Test
    public void testMiniCost(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MINI);
        double cost = bistec.cost();
        assertEquals(7.0, cost,0);
    }
    @Test
    public void testRegularCost(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.REGULAR);
        double cost = bistec.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testMegaCost(){
        Taco bistec = new Bistec(taco);
        when(taco.cost()).thenReturn(8.0);
        when(taco.getSize()).thenReturn(taco.MEGA);
        double cost = bistec.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco bistec = new Bistec(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = bistec.getDescription();
        assertEquals("Taco Normal de bistec", desc);
    }
}
