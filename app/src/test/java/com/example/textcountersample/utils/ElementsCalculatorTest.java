package com.example.textcountersample.utils;

import org.junit.Test;
import static org.junit.Assert.*;

public class ElementsCalculatorTest {
    
    // Character count tests
    @Test
    public void getCharsCount_nullInput_returns0() {
        assertEquals(0, ElementsCalculator.getCharsCount(null));
    }

    @Test
    public void getCharsCount_emptyString_returns0() {
        assertEquals(0, ElementsCalculator.getCharsCount(""));
    }

    @Test
    public void getCharsCount_singleWord_returnsCorrectCount() {
        assertEquals(5, ElementsCalculator.getCharsCount("Hello"));
    }

    @Test
    public void getCharsCount_multipleWords_returnsCorrectCount() {
        assertEquals(11, ElementsCalculator.getCharsCount("Hello World"));
    }

    @Test
    public void getCharsCount_onlySpaces_returnsSpaceCount() {
        assertEquals(3, ElementsCalculator.getCharsCount("   "));
    }

    @Test
    public void getCharsCount_specialCharacters_returnsCorrectCount() {
        assertEquals(8, ElementsCalculator.getCharsCount("!@#$%^&*"));
    }

    // Word count tests
    @Test
    public void getWordsCount_nullInput_returns0() {
        assertEquals(0, ElementsCalculator.getWordsCount(null));
    }

    @Test
    public void getWordsCount_emptyString_returns0() {
        assertEquals(0, ElementsCalculator.getWordsCount(""));
    }

    @Test
    public void getWordsCount_onlySpaces_returns0() {
        assertEquals(0, ElementsCalculator.getWordsCount("   "));
    }

    @Test
    public void getWordsCount_singleWord_returns1() {
        assertEquals(1, ElementsCalculator.getWordsCount("Hello"));
    }

    @Test
    public void getWordsCount_twoWords_returns2() {
        assertEquals(2, ElementsCalculator.getWordsCount("Hello World"));
    }

    @Test
    public void getWordsCount_multipleSpacesBetweenWords_returnsWordCount() {
        assertEquals(3, ElementsCalculator.getWordsCount("Hello    World     Test"));
    }

    @Test
    public void getWordsCount_specialCharacters_returnsWordCount() {
        assertEquals(4, ElementsCalculator.getWordsCount("Hello! World, How? Great!"));
    }

    @Test
    public void getWordsCount_leadingAndTrailingSpaces_returnsWordCount() {
        assertEquals(2, ElementsCalculator.getWordsCount("   Hello   World   "));
    }
} 