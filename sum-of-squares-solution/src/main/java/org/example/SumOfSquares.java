package org.example;

import java.util.Arrays;
import java.util.List;

public class SumOfSquares {

    public static long sumOfSquaresOfEvenNumbers(List<Integer> numbers) {
        return numbers.parallelStream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long sum = sumOfSquaresOfEvenNumbers(numbers);

        System.out.println("Sum of squares of even numbers: " + sum);
    }
}