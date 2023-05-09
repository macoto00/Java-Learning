package fibonacci;

public class Fibonacci {
    //    Write a function that computes a member of the fibonacci sequence by a given index
//    Create tests for multiple test cases.
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    public static int fibonacci(int index) {
        if (index < 0) {
            return 0;
        } else if (index < 2) {
            return index;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }
    }
}
