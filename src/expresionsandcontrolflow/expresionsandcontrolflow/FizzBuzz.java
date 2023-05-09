package expresionsandcontrolflow.expresionsandcontrolflow;/*public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100
        // but for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
    }
}*/

public class FizzBuzz {
    public static void main(String[] args) {
        // Write firstNumber program that prints the numbers from 1 to 100
        // but for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".

        int firstNumber = 1;

        // write numbers from 1 to 100
        while (firstNumber <= 100) {

            // For numbers which are multiples of both three and five print "FizzBuzz".
            if (firstNumber % 3 == 0 && firstNumber % 5 == 0) {
                System.out.println("FizzBuzz");
            }

            // but for multiples of three print "Fizz" instead of the number
            else if (firstNumber % 3 == 0) {
                System.out.println("Fizz");
            }

            // and for the multiples of five print "Buzz".
            else if (firstNumber % 5 == 0) {
                System.out.println("Buzz");
            }

            // Prints firstNumber
            else {
                System.out.println(firstNumber);
            }
            firstNumber += 1;
        }
    }
}