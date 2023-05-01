package functions;

//        Create a function named search() following your current
//        language's style guide. It should take a string, search
//        for palindromes of length at least 3 within it and return
//        them in an array.
//
//        Hint: create a function named isPalindrome() which takes
//        a string as an input and returns true/false depending on
//        whether the string is a palindrome or not.
//
//        Examples
//        input	                                    output
//        "dog goat dad duck doodle never"	        ["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
//        "apple"	                                []
//        "racecar"	                                ["racecar", "aceca", "cec"]
//        ""	                                    []

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeSearcher {
    public static void main(String[] args) {
        String input = "dog goat dad duck doodle never";
        String[] output = search(input);
        System.out.println(Arrays.toString(output));
    }

    private static String[] search(String string) {
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < string.length() - 2; i++) {
            for (int j = i + 2; j < string.length(); j++) {
                String sub = string.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    palindromes.add(sub);
                }
            }
        }
        return palindromes.toArray(new String[0]);
    }

    private static boolean isPalindrome(String string) {
        string = string.trim().toLowerCase();
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
