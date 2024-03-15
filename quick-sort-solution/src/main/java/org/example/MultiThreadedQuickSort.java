package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.*;

public class MultiThreadedQuickSort {

    // Thread pool for sorting tasks
    public static ExecutorService threadPool;

    // Entry point for the quicksort algorithm
    public static void quicksort(int[] array) {
        // Initialize the thread pool
        threadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

        // Create a Future for the sorting task
        Future<?> future = threadPool.submit(new SortTask(array, 0, array.length - 1));

        try {
            // Wait for the sorting task to complete
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            // Shutdown the thread pool
            threadPool.shutdown();
        }
    }

    // Recursive task for sorting a portion of the array
    private static class SortTask implements Runnable {
        private final int[] array;
        private final int low;
        private final int high;

        public SortTask(int[] array, int low, int high) {
            this.array = array;
            this.low = low;
            this.high = high;
        }

        @Override
        public void run() {
            if (low < high) {
                int pivotIndex = partition(array, low, high);
                // Create new tasks for the left and right partitions
                Future<?> leftFuture = threadPool.submit(new SortTask(array, low, pivotIndex - 1));
                Future<?> rightFuture = threadPool.submit(new SortTask(array, pivotIndex + 1, high));
                try {
                    // Wait for both tasks to complete
                    leftFuture.get();
                    rightFuture.get();
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }

        // Partitioning method for quicksort
        private int partition(int[] array, int low, int high) {
            int pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (array[j] <= pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;
            return i + 1;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 7, 2, 8, 4, 1, 6};
        System.out.println("Original array:");
        printArray(array);

        quicksort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    // Utility method to print an array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}