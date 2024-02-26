package org.example.main.controllers;

import org.example.IntegerInputHandler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestIntegerInputHandler {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("abc".getBytes());

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

    @Test
    public void testHandleIntegerInput_InvalidInput() {
        IntegerInputHandler.handleIntegerInput();
        assertEquals("Invalid input. Please enter an integer", outputStream.toString());
    }
}
