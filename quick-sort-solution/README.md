# Multithreaded QuickSort


## Problem Statement:
Your task is to implement a multithreaded version of the QuickSort algorithm, which sorts an array of integers in 
ascending order. The implementation should utilize Java's concurrency tools to divide the sorting task into subtasks, 
each running in separate threads.

The provided `MultiThreadedQuickSort` class serves as a template for your implementation. This class uses an 
`ExecutorService` to manage a pool of threads for sorting tasks, allowing the QuickSort algorithm to execute in a 
parallelized manner. 


## Instructions
- You are given a class `MultiThreadedQuickSort` in which there is a function `quicksort` which sorts the array in 
  ascending order.
- The `quicksort` function uses a fixed size thread pool equal to the number of available processors in the computer.
- The method waits for the thread pool to complete its execution before terminating it.
- Implement the function `run` inside the static class `SortTask` along with its constructor.
- The `run` method should work normally like the quick sort algorithm in which we first find the pivot point and then
  sort the left and the right subarray subtask using the executor service
- You have to sort the left and the right subarray inside the `run` method using two different threads and wait for both
the threads to complete their execution before performing any other operation.
- The `partition` function, which is used to find the pivot index, is already implemented for your convenience. You do not need to implement it.