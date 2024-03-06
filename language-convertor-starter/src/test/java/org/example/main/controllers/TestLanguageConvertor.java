package org.example.main.controllers;


import org.example.LanguageConvertor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLanguageConvertor {

    @Test
    public void testConvertToUpperCase() {
        List<String> languages = Arrays.asList("java", "python", "javascript", "c++", "ruby");
        List<String> expectedUpperCaseLanguages = Arrays.asList("JAVA", "PYTHON", "JAVASCRIPT", "C++", "RUBY");
        List<String> actualUpperCaseLanguages = LanguageConvertor.convertToUpperCase(languages);

        assertEquals(expectedUpperCaseLanguages, actualUpperCaseLanguages);


        languages = Arrays.asList("a", "aa", "AA", "Hello", "XuAysAoA");
        expectedUpperCaseLanguages = Arrays.asList("A", "AA", "AA", "HELLO", "XUAYSAOA");
        actualUpperCaseLanguages = LanguageConvertor.convertToUpperCase(languages);

        assertEquals(expectedUpperCaseLanguages, actualUpperCaseLanguages);
    }

    @Test
    public void testConvertToUpperCase_EmptyList() {
        List<String> languages = Arrays.asList();
        List<String> expectedUpperCaseLanguages = Arrays.asList();
        List<String> actualUpperCaseLanguages = LanguageConvertor.convertToUpperCase(languages);

        assertEquals(expectedUpperCaseLanguages, actualUpperCaseLanguages);
    }
}

