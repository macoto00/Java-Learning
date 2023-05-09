package recursion;
// Implement "numberAdder" which is a recursive function that takes one parameter: n (number)
// and returns the sum of integers from 1 to n.
// The function should return 0 for inputs less than 1.

public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(numberAdder(4));

    }

    public static int numberAdder(int number) {

        if (number  <= 0) {
            return 0;
        } else {
            return number + numberAdder(number - 1);
        }
    }
}