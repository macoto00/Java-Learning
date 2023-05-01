package functions;

public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper (Sum) and main method on your own

// Write a function called `sum()` that returns the sum of numbers from zero
// to the given parameter
//
// Example: sum(5) = 0 + 1 + 2 + 3 + 4 + 5 = 15

        int parameter = 5;
        System.out.println(Sum(parameter));
    }

    public static int Sum (int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
