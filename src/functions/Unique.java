package functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        // Create a function that takes an array of numbers as a parameter
        // and returns an array of integers where every integer is unique
        // (occurs only once)

        // Example
        System.out.println(Arrays.toString(findUniqueItems(
                new int[]{1, 11, 34, 11, 52, 61, 1, 34})));
        // should print: `[1, 11, 34, 52, 61]`
    }

    private static int[] findUniqueItems(int[] ints) {
        ArrayList<Integer> uniqueArray = new ArrayList<>();
        for (int currentNumber : ints) {
            if (!uniqueArray.contains(currentNumber)) {
                uniqueArray.add(currentNumber);
            }
        }
        int[] result = new int[uniqueArray.size()];
        for (int i = 0; i < uniqueArray.size(); i++) {
            result[i] = uniqueArray.get(i);
        }
        return result;
    }
}
