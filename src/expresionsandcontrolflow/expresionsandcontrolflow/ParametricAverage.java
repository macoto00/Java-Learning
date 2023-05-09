package expresionsandcontrolflow.expresionsandcontrolflow;//public class ParametricAverage {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input.
//        // Next, the program will prompt the user to enter as many numbers
//        // as the value of the first number the user entered.
//        // Once the user enters all numbers the program will print
//        // their sum and average.
//        //
//        // Example:
//        //
//        // How many numbers would you like to enter: 6
//        // Enter number 1 of 6: 2
//        // Enter number 2 of 6: 3
//        // Enter number 3 of 6: 7
//        // Enter number 4 of 6: 9
//        // Enter number 5 of 6: 11
//        // Enter number 6 of 6: 0
//        // Sum: 32, Average: 5.333333333333333
//        //
//    }
//}

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write userArray program that reads userArray number from the standard input.
        // Next, the program will prompt the user to enter as many numbers
        // as the value of the first number the user entered.
        // Once the user enters all numbers the program will print
        // their sum and average.
        //
        // Example:
        //
        // How many numbers would you like to enter: 6
        // Enter number 1 of 6: 2
        // Enter number 2 of 6: 3
        // Enter number 3 of 6: 7
        // Enter number 4 of 6: 9
        // Enter number 5 of 6: 11
        // Enter number 6 of 6: 0
        // Sum: 32, Average: 5.333333333333333
        //

        // Declare variables
        int firstUserNumber, sum = 0;
        int helpToCount = 1;
        float average;

        // Initial scanner
        Scanner scanner = new Scanner(System.in);

        // Tell user how many numbers he wants
        System.out.print("How many numbers would you like to enter: ");

        // User tells how many numbers
        firstUserNumber = scanner.nextInt();
        int[] userArray = new int[firstUserNumber];

        // User declares array of numbers he wants
        for(int i = 0; i < firstUserNumber ; i++)
        {
            System.out.print("Enter number " + helpToCount + " of " + userArray.length + ": ");
            userArray[i] = scanner.nextInt();
            helpToCount += 1;

            // Sum of the user numbers
            sum = sum + userArray[i];
        }

        // Average of the user numbers
        average = (float) sum / firstUserNumber;

        // Print the result
        System.out.print("Sum: " + sum + ", " + "Average: " + average);
    }
}