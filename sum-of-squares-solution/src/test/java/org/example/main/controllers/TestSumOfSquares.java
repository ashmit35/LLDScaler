package org.example.main.controllers;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.example.SumOfSquares;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class TestSumOfSquares {

    @Test
    public void testSumOfSquaresOfEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        long expectedSum = TestHelper.sumOfSquaresOfEvenNumbers(numbers);
        long actualSum = SumOfSquares.sumOfSquaresOfEvenNumbers(numbers);

        assertEquals(expectedSum, actualSum);

        numbers = Arrays.asList(100,100,102,2002,19821,871,9918);
        expectedSum = TestHelper.sumOfSquaresOfEvenNumbers(numbers);
        actualSum = SumOfSquares.sumOfSquaresOfEvenNumbers(numbers);

        assertEquals(expectedSum, actualSum);

        numbers = Arrays.asList(-2,-4,-6,-8,-1082,9812,8721,999999,999912);
        expectedSum = TestHelper.sumOfSquaresOfEvenNumbers(numbers);
        actualSum = SumOfSquares.sumOfSquaresOfEvenNumbers(numbers);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfSquaresOfEvenNumbers_NoEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        long expectedSum = 0;
        long actualSum = SumOfSquares.sumOfSquaresOfEvenNumbers(numbers);

        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfSquaresOfEvenNumbers_EmptyList() {
        List<Integer> numbers = Arrays.asList();
        long expectedSum = 0;
        long actualSum = SumOfSquares.sumOfSquaresOfEvenNumbers(numbers);

        assertEquals(expectedSum, actualSum);
    }
}
