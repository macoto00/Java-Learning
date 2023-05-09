package recursion;
// Write a function which returns the largest element of an array using recursion.

public class MaximumFinder {
    public static void main(String[] args) {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(recursion(number));
    }

    private static int recursion(int[] number) {
        if (number.length == 0) {
            return 0;
        } else {
            recursion(number);
        }
        return 0;
    }
}
