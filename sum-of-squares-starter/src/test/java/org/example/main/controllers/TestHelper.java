package org.example.main.controllers;

import java.util.List;

public class TestHelper {
    public static long sumOfSquaresOfEvenNumbers(List<Integer> numbers) {
        return numbers.parallelStream()
                .filter(num -> num % 2 == 0)
                .mapToInt(num -> num * num)
                .sum();
    }
}