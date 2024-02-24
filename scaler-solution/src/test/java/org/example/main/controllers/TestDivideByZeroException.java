package org.example.main.controllers;
import org.example.DivideByZeroException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestDivideByZeroException {
    // Unit tests
    @Test
    public void testDivision() {
        assertEquals(2, DivideByZeroException.divide(6, 3), 0.0001);
        assertEquals(0, DivideByZeroException.divide(1, 2), 0.0001);
        assertEquals(0, DivideByZeroException.divide(-1, 2), 0.0001);
        assertEquals(5, DivideByZeroException.divide(-15, -3), 0.0001);
        assertEquals(2, DivideByZeroException.divide(20, 10), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        assertEquals(-1, DivideByZeroException.divide(5, 0), 0.0001);
        assertEquals(-1, DivideByZeroException.divide(10, 0), 0.0001);
        assertEquals(-1, DivideByZeroException.divide(-2, 0), 0.0001);
        assertEquals(-1, DivideByZeroException.divide(92, 0), 0.0001);
        assertEquals(-1, DivideByZeroException.divide(9, 0), 0.0001);
    }

}
