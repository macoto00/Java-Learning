package countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void testDictionaryWithEmptyString() {
        HashMap<String, Integer> expected = new HashMap<>();
        HashMap<String, Integer> actual = CountLetters.dictionary("");
        assertEquals(expected, actual);
    }

    @Test
    void testDictionaryWithSingleCharacter() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        HashMap<String, Integer> actual = CountLetters.dictionary("a");
        assertEquals(expected, actual);
    }

    @Test
    void testDictionaryWithMultipleCharacters() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("d", 1);
        expected.put("o", 1);
        expected.put("g", 1);
        HashMap<String, Integer> actual = CountLetters.dictionary("dog");
        assertEquals(expected, actual);
    }

    @Test
    void testDictionaryWithRepeatedCharacters() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("a", 3);
        HashMap<String, Integer> actual = CountLetters.dictionary("aaa");
        assertEquals(expected, actual);
    }

    @Test
    void testDictionaryWithMixedCase() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 1);
        expected.put("c", 1);
        HashMap<String, Integer> actual = CountLetters.dictionary("Aabc");
        assertEquals(expected, actual);
    }

    @Test
    void testDictionaryWithWhitespace() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        HashMap<String, Integer> actual = CountLetters.dictionary("a a");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testDictionaryWithWhitespaceAround() {
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        HashMap<String, Integer> actual = CountLetters.dictionary(" aa ");
        Assertions.assertEquals(expected, actual);
    }
}