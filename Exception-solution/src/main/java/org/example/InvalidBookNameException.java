package org.example;

public class InvalidBookNameException extends Exception {
    public InvalidBookNameException(String message) {
        super(message);
    }
}