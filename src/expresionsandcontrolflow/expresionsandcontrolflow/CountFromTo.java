package expresionsandcontrolflow.expresionsandcontrolflow;/*public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers. If the second number
        // is not greater than the first the program should print:
        // "The second number should be bigger"
        //
        // Otherwise it should output all integers between the first and
        // the second number (excluding the second number)
        //
        // Example:
        //
        // Please enter the first number: 3
        // Please enter the second number: 6
        // 3
        // 4
        // 5
    }
}*/

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers. If the second number
        // is not greater than the first the program should print:
        // "The second number should be bigger"
        //
        // Otherwise it should output all integers between the first and
        // the second number (excluding the second number)
        //
        // Example:
        //
        // Please enter the first number: 3
        // Please enter the second number: 6
        // 3
        // 4
        // 5

        System.out.print("Please enter first number: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        int input1 = scanner.nextInt();

        System.out.print("Please enter second number: ");

        // The program stops and waits for user input and to press enter
        int input2 = scanner.nextInt();

        // If the second number is not greater than the first the program should print:
        if (input2 <= input1) {
            System.out.print("The second number should be bigger");
        }

        // Otherwise it should output all integers between the first and
        // the second number (excluding the second number)
        else {
            while (input1 < input2) {
                System.out.println(input1); // Prints input1
                input1 += 1;
            }
        }
    }
}