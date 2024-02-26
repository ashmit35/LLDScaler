package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInputHandler {

    // Method to handle user input for an integer
    public static void handleIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            System.out.println("The entered number is: "+num);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }

    public static void main(String[] args) {
        handleIntegerInput();
    }
}