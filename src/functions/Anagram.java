package functions;

//        Create a function named **isAnagram()** following your current language's style
//        guide. It should take two strings and return a boolean value depending on
//        whether it's an anagram or not.
//
//        The function should ignore the letter case as well as any non (latin) letter
//        characters, i.e. "Astronomer" is an anagram of "Moon starer!"
//
//        ### Examples
//
//        | input 1 | input 2 | output |
//        | :-----: | :-----: | :----: |
//        |  "dog"  |  "god"  |  true  |
//        | "green" |  "fox"  |  false |

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("doge", "god"));
    }
    public static boolean isAnagram (String input1, String input2) {
        input1.trim();
        input2.trim();

        input1.toLowerCase();
        input2.toLowerCase();

        if (input1.length() == input2.length()) {
            char[] array1 = input1.toCharArray();
            char[] array2 = input2.toCharArray();

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
