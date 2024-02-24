package org.example.main.controllers;

import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    // Unit tests
    @Test
    public void testDivision() {
        assertEquals(2, Main.divide(6, 3), 0.0001);
        assertEquals(0, Main.divide(1, 2), 0.0001);
        assertEquals(0, Main.divide(-1, 2), 0.0001);
        assertEquals(5, Main.divide(-15, -3), 0.0001);
        assertEquals(2, Main.divide(20, 10), 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        assertEquals(-1, Main.divide(5, 0), 0.0001);
        assertEquals(-1, Main.divide(10, 0), 0.0001);
        assertEquals(-1, Main.divide(-2, 0), 0.0001);
        assertEquals(-1, Main.divide(92, 0), 0.0001);
        assertEquals(-1, Main.divide(9, 0), 0.0001);
    }

}
