package arrays;


import java.util.Arrays;

public class PrintAll {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[4, 5, 6, 7]`
        // - Print all the elements of `numbers`
        //   one element per line

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[2]);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}