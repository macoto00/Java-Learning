package recursion;

public class GCD {
    // great common divisor
    // Write a recursive method which returns the greatest common divisor (GCD)
    // of two numbers. The method should be able to handle negative numbers!
    public static int findGCD(int num1, int num2) {
        // If either of the numbers is zero, the GCD is the absolute value of the other number
        if (num1 == 0) {
            return Math.abs(num2);
        }
        if (num2 == 0) {
            return Math.abs(num1);
        }

        // If both numbers are negative, change them to positive
        if (num1 < 0 && num2 < 0) {
            num1 = Math.abs(num1);
            num2 = Math.abs(num2);
        }

        // Recursive call to find GCD
        if (num1 > num2) {
            return findGCD(num1 - num2, num2);
        } else {
            return findGCD(num1, num2 - num1);
        }
    }
}

