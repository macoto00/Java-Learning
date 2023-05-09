package countletters;

import java.util.HashMap;

public class CountLetters {
//    Write a function, that takes a string as an argument and returns
//    a dictionary with all letters in the string as keys, and numbers
//    as values that shows how many occurrences there are.
//    Create a test for that.
public static void main(String[] args) {
    System.out.println(dictionary("dog "));
}
    public static HashMap dictionary(String word) {
        // String word = "Dictionary of letters.";

        word = word.trim();

        word = word.toLowerCase();

        word = word.replaceAll("\\s","");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < word.length(); i++) {
            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    counter++;
                }
                map.put(String.valueOf(word.charAt(i)), counter);
            }
        }
        return map;
    }
}
