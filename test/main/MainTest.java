package main;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Eugeny on 11.09.2016.
 */
public class MainTest {
    @Test
    public void testF1() throws Exception {
        Main main = new Main();
        double result = main.f(10);
        double expected = -0.54402111;
        assertEquals(expected, result, 1e-8);
    }

    @Test
    public void testF2() throws Exception {
        Main main = new Main();
        double result = main.f(0);
        double expected = 1;
        assertEquals(expected, result, 1e-8);
    }

    @Test
    public void testSteps() throws Exception {
        Main main = new Main();
        int result = main.steps(0,10,0.1);
        int expected = 101;
        assertEquals(expected, result);
    }

    @Test
    public void testCreateX() throws Exception {
        Main main = new Main();
        double[] x = main.createX(2, 5, 0.005);
        double result = x[280];
        double expected = 3.4;
        assertEquals(expected, result, 1e-8);
        assertEquals(2, x[0], 1e-8);
        assertEquals(5, x[600], 1e-8);
    }

    @Test
    public void testFindMin() throws Exception {
        Main main = new Main();
        double[] a = {2, 5, -4.1, 10, 3.5};
        int expected = 2;
        int result = main.findMin(a);
        assertEquals(expected, result);
    }
}