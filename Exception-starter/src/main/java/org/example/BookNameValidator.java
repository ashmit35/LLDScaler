package org.example;

public class BookNameValidator {
    public static void validate(String bookName) throws InvalidBookNameException {
        //code here
        throw new InvalidBookNameException("Message");
    }
    public static void main(String[] args) {


        try {
            validate("Scaler Java");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler Java Programming");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler Java Learn Here");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler Java is amazing");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler Java Scaler Java::::");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("ScalerJava");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Java Programming by Scaler");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Java");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("Scaler");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate(" ");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }
        try {
            validate("");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

        try {
            validate("scaler java");
        } catch (InvalidBookNameException e) {
            System.out.println(e.getMessage());
        }

    }
}