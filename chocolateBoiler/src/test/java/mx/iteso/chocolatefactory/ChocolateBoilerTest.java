package mx.iteso.chocolatefactory;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

/**
 * Created by Giovanni on 02/11/2015.
 */
public class ChocolateBoilerTest {
    ChocolateBoiler chocolateBoiler;
    ChocolateBoiler chocolateBoiler1;
    ChocolateBoiler chocolateBoiler2;
    ChocolateBoiler chocolateBoilers [];
    int i;

    @Before
    public void setUp(){
        chocolateBoiler = ChocolateBoiler.getInstance();
        chocolateBoilers = new ChocolateBoiler[200];
        i=0;
    }

    @Test
    public void tetFill(){
        chocolateBoiler.fill();
        assertEquals(false, chocolateBoiler.isEmpty());
        System.out.println();
    }

    @Test
    public void testBoil(){
        chocolateBoiler.boil();
        assertEquals(true, chocolateBoiler.isBoiled());
    }

    @Test
    public void testDrain(){
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        assertEquals(true, chocolateBoiler.isEmpty());
    }

    @Test
    public void testSameInstance(){
        chocolateBoiler1 = ChocolateBoiler.getInstance();
        assertEquals(true, chocolateBoiler == chocolateBoiler1);
    }

    @Test
    public void testThreadSafeInstances(){
        ChocolateBoiler.deleteInstance();
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(4);

        Thread t1 = new Thread(){
            public void run(){
                try {
                    cyclicBarrier.await();
                    chocolateBoiler = ChocolateBoiler.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }};
        Thread t2 = new Thread(){
            public void run(){
                try {
                    cyclicBarrier.await();
                    chocolateBoiler1 = ChocolateBoiler.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }};

        Thread t3 = new Thread(){
            public void run(){
                try {
                    cyclicBarrier.await();
                    chocolateBoiler2 = ChocolateBoiler.getInstance();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }};

        t1.start();
        t2.start();
        t3.start();

        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertSame(chocolateBoiler, chocolateBoiler1);
        assertSame(chocolateBoiler1, chocolateBoiler2);

    }

    @Test
    public void testMethodsWithThreads(){
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(201);
        Thread threads [] = new Thread[200];

        for(i=0; i<200; i++){
            threads[i] = new Thread(){
                public void run(){
                    try {
                        cyclicBarrier.await();
                        System.out.println(""+i);
                        chocolateBoilers[i] = ChocolateBoiler.getInstance();
                        chocolateBoilers[i].fill();
                        chocolateBoilers[i].boil();
                        chocolateBoilers[i].drain();
                        i++;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }
            };
        }

        for(i=0; i<200; i++){
            threads[i].start();
        }

        i=0;

        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
            assertEquals(true, chocolateBoiler.fillTimes == chocolateBoiler.boilTimes);
            assertEquals(true, chocolateBoiler.boilTimes == chocolateBoiler.drainTimes);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
