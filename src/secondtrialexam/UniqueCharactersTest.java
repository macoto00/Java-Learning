package com.gfa.exam;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueCharactersTest {

    @Test
    public void testGetUniqueChars() {
        String input = "anagram";
        List<Character> expected = Arrays.asList('n', 'g', 'r', 'm');
        assertEquals(expected, UniqueCharacters.getUniqueChars(input));
    }

    @Test
    public void testGetUniqueCharsEmpty() {
        String input = "";
        List<Character> expected = Collections.emptyList();
        assertEquals(expected, UniqueCharacters.getUniqueChars(input));
    }
}