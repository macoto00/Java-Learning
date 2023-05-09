package anagram;

import java.util.Arrays;

public class Anagram {
//    Write a function, that takes two strings and returns
//    a boolean value based on if the two strings are Anagramms or not.
//    Create a test for that.
    public static boolean  anagram(String first) {
        // String first = "Race ";
        String second = "Care";

        first = first.trim();
        second = second.trim();

        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() == second.length()) {
            char[] array1 = first.toCharArray();
            char[] array2 = second.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if (Arrays.equals(array1, array2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

