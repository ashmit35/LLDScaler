package org.example.main.controllers;

import org.example.ArrayIndexOutOfBounds;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestArrayIndexOutOfBounds {
    @Test
    public void testAccessArrayElement() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3, ArrayIndexOutOfBounds.accessArrayElement(array, 2));
        assertEquals(5, ArrayIndexOutOfBounds.accessArrayElement(array, 4));
        assertEquals(1, ArrayIndexOutOfBounds.accessArrayElement(array, 0));
        assertEquals(4, ArrayIndexOutOfBounds.accessArrayElement(array, 3));

        int arr[] = {0,5,3,8,9,10000,98432,98127,1243834,233};
        assertEquals(0, ArrayIndexOutOfBounds.accessArrayElement(arr, 0));
        assertEquals(8, ArrayIndexOutOfBounds.accessArrayElement(arr, 3));
        assertEquals(233, ArrayIndexOutOfBounds.accessArrayElement(arr, 9));
        assertEquals(98432, ArrayIndexOutOfBounds.accessArrayElement(arr, 6));

    }

    @Test
    public void testAccessArrayElementOutOfBounds() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(-1, ArrayIndexOutOfBounds.accessArrayElement(array, 10));
        assertEquals(-1, ArrayIndexOutOfBounds.accessArrayElement(array, 5));
        assertEquals(-1, ArrayIndexOutOfBounds.accessArrayElement(array, -1));
        assertEquals(-1, ArrayIndexOutOfBounds.accessArrayElement(array, -2));
    }
}
