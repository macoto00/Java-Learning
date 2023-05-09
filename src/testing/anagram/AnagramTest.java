package anagram;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    String first;

    @Test
    @DisplayName("Test if first smaller string is a palindrome of the second.")
    void anagramSmallerString() {
        first = "dog";
        boolean expected = false;
        assertEquals(expected, Anagram.anagram(first));
    }

    @Test
    @DisplayName("Test if first bigger string is a palindrome of the second.")
    void anagramBiggerString() {
        first = "biggest";
        boolean expected = false;
        assertEquals(expected, Anagram.anagram(first));
    }

    @Test
    @DisplayName("Test if first string is a palindrome of the second while having spaces around.")
    void anagramStringWithSpaces() {
        first = " Race ";
        boolean expected = true;
        assertEquals(expected, Anagram.anagram(first));
    }

    @Test
    @DisplayName("Test if first string is a palindrome of the second while having big chars.")
    void anagramStringWithBigChars() {
        first = "RaCe";
        boolean expected = true;
        assertEquals(expected, Anagram.anagram(first));
    }
}