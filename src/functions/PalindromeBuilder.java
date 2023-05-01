package functions;

//        Exercise
//        Create a function named build() following your current language's style guide.
//        It should take a string, create a palindrome from it and then return it.
//
//        Examples
//        input	            output
//        ""	            ""
//        "greenfox"	    "greenfoxxofneerg"
//        "123"	            "123321"

import java.util.ArrayList;

public class PalindromeBuilder {
    public static void main(String[] args) {
        System.out.println(build("dog"));
    }

    private static String build(String string) {

        string.trim().toLowerCase();

        char[] array1 = string.toCharArray();
        char[] array2 = new char[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) {
            array2[j] = array1[i];
        }

//        Longer version:
//        StringBuilder palindrome = new StringBuilder();
//        palindrome.append(array1);
//        palindrome.append(array2);
//
//        return palindrome.toString();

        // Shorter version:
        return String.valueOf(array1) +
                String.valueOf(array2);
    }
}
