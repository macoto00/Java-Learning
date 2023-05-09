package recursion;

// Given a non-negative integer n, return the sum of its digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).
public class SumDigits {

    public static void main(String[] args) {

        System.out.println(sumDigits(126));
    }

    public static int sumDigits(int number) {

        if (number == 0) {
            return 0;
        } else {
            return (number % 10) + sumDigits(number / 10);
        }
    }

}
