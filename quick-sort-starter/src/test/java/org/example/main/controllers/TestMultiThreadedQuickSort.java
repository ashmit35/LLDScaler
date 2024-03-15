package org.example.main.controllers;

import org.example.MultiThreadedQuickSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMultiThreadedQuickSort {

    @Test
    public void testSort() throws InterruptedException {
        int[] array = {3, 6, 1, 8, 2, 4, 9, 5, 7};
        // Sorts the array in place
        MultiThreadedQuickSort.quicksort(array);

        System.out.println("Active Threads" + Thread.activeCount());

        // Verify that the ExecutorService object is not null
        assertNotNull(MultiThreadedQuickSort.threadPool);

        // Check if multiple threads were created
        assertTrue(Thread.activeCount() > 1);

        //Output Matching
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},array);

        // Verify that the ExecutorService has the expected number of threads
        int expectedThreads = Runtime.getRuntime().availableProcessors();
        int actualThreads = ((java.util.concurrent.ThreadPoolExecutor) MultiThreadedQuickSort.threadPool).getCorePoolSize();
        assertEquals(actualThreads, expectedThreads);

    }
}
