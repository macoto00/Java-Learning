package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main(String[] args) {
        // Create a function that takes an array of numbers as parameter
        // and returns an array where the elements are sorted in ascending numerical
        // order
        // When you are done, add a second boolean parameter to the function
        // If it is `true` sort the array descending, otherwise ascending

        // Example:
        System.out.println(Arrays.toString(bubble(new int[]{34, 12, 24, 9, 5})));
        // should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[]{34, 12, 24, 9, 5}, true)));
        // should print [34, 24, 12, 9, 5]
    }

    private static Object[] bubble(int[] ints) {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int currentNumber : ints) {
            sortedArray.add(currentNumber);
        }
        Collections.sort(sortedArray);
        return sortedArray.toArray();
    }

    private static Object[] advancedBubble(int[] ints, boolean b) {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int currentNumber : ints) {
            sortedArray.add(currentNumber);
        }
        Collections.sort(sortedArray);
        if (b) {
            sortedArray.sort(Collections.reverseOrder());
        }
        return sortedArray.toArray();
    }
}

