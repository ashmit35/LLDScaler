package org.example.main.controllers;

import org.example.BookNameValidator;
import org.example.InvalidBookNameException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestBookNameValidator {
    // Unit test to check validation with valid book name
    @Test
    public void testValidBookName() {
        assertDoesNotThrow(() -> BookNameValidator.validate("Scaler Java Programming"));
        assertDoesNotThrow(() -> BookNameValidator.validate("Scaler Java"));
        assertDoesNotThrow(() -> BookNameValidator.validate("Scaler Java Learn Here"));
        assertDoesNotThrow(() -> BookNameValidator.validate("Scaler Java is amazing"));
        assertDoesNotThrow(() -> BookNameValidator.validate("Scaler Java Scaler Java::::"));
    }

    // Unit test to check validation with invalid book name
    @Test
    public void testInvalidBookName() {
        assertThrows(InvalidBookNameException.class, () -> BookNameValidator.validate("Java Programming by Scaler"));
        assertThrows(InvalidBookNameException.class, () -> BookNameValidator.validate("ScalerJava"));
        assertThrows(InvalidBookNameException.class, () -> BookNameValidator.validate("Java"));
        assertThrows(InvalidBookNameException.class, () -> BookNameValidator.validate("Scaler"));
        assertThrows(InvalidBookNameException.class, () -> BookNameValidator.validate(""));
        assertThrows(InvalidBookNameException.class, () -> BookNameValidator.validate(" "));
        assertThrows(InvalidBookNameException.class, () -> BookNameValidator.validate("scaler java"));
    }
}