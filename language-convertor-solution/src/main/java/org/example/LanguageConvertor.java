package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LanguageConvertor {
    public static List<String> convertToUpperCase(List<String> languages) {
        return languages.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("java", "python", "javascript", "c++", "ruby");
        List<String> upperCaseLanguages = convertToUpperCase(languages);
        System.out.println("Languages in uppercase: " + upperCaseLanguages);
    }
}
