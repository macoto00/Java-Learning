package com.gfa.exam;

import java.util.ArrayList;
import java.util.List;

public class UniqueCharacters {
    public static void main(String[] args) {
        String string = "anagram";
        System.out.println(getUniqueChars(string));
    }
    public static List<Character> getUniqueChars(String input) {
        List<Character> uniqueChars = new ArrayList<>();
        List<Character> repeatedChars = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (repeatedChars.contains(c)) {
                continue;
            }
            if (uniqueChars.contains(c)) {
                uniqueChars.remove((Character) c);
                repeatedChars.add(c);
            } else {
                uniqueChars.add(c);
            }
        }
        return uniqueChars;
    }
}

