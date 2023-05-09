package expresionsandcontrolflow.expresionsandcontrolflow;/*public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        //
        // Example
        //
        // Please enter a number: 5
        // A lot
    }
}*/

import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        // Write a program that reads a number form the standard input,
        // If the number is zero or smaller it should print: Not enough
        // If the number is one it should print: One
        // If the number is two it should print: Two
        // If the number is more than two it should print: A lot
        //
        // Example
        //
        // Please enter a number: 5
        // A lot

        System.out.print("Please enter a number: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        int userInput1 = scanner.nextInt();

        if (userInput1 <= 0) {
            System.out.print("Not enough");
        } else if (userInput1 == 1) {
            System.out.print("One");
        } else if (userInput1 == 2) {
            System.out.print("Two");
        } else if (userInput1 > 2) {
            System.out.print("A lot");
        }
    }
}