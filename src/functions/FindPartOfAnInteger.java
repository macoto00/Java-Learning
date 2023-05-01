package functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPartOfAnInteger {
    public static void main(String[] args) {
        // Create a function that takes a number (a digit) and an array of integers
        // as parameters and returns the indices of the integers in the array
        // which contain the given digit or returns an empty array
        // (if no number in the array contains the given digit)

        // Examples:
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] { 1, 11, 34, 52, 61 })));
        // should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] { 1, 11, 34, 52, 61 })));
        // should print: '[]'

        // Note: We are using Arrays.toString() function to print the returned array
        // You could just as well iterate over the array and print its items one by one
    }

    public static int[] findMatchingIndexes(int digit, int[] array) {
        ArrayList<Integer> matchingIndexes = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            while (currentNumber > 0) {
                if (currentNumber % 10 == digit) {
                    matchingIndexes.add(i);
                    break;
                }
                currentNumber /= 10;
            }
        }
        int[] result = new int[matchingIndexes.size()];
        for (int i = 0; i < matchingIndexes.size(); i++) {
            result[i] = matchingIndexes.get(i);
        }
        return result;
    }
}