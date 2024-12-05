package com.example.textcountersample.utils;

public class ElementsCalculator {
    public static int getCharsCount(String inputText) {
        if (inputText == null) {
            return 0;
        }
        return inputText.length();
    }

    public static int getWordsCount(String inputText) {
        if (inputText == null || inputText.trim().isEmpty()) {
            return 0;
        }
        return inputText.trim().split("\\s+").length;
    }
}
