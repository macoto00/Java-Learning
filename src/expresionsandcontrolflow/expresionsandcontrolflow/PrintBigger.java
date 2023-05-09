package expresionsandcontrolflow.expresionsandcontrolflow;/*public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one.
        // If they are equal, it prints the second one.
        //
        // Example
        //
        // Please enter a number: 5
        // Please enter a number: 13
        // 13
    }
}*/

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one.
        // If they are equal, it prints the second one.
        //
        // Example
        //
        // Please enter a number: 5
        // Please enter a number: 13
        // 13

        System.out.print("Please enter a number: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        int userInput1 = scanner.nextInt();

        System.out.print("Please enter a number: ");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput2 = scanner.nextInt();

        if (userInput1 > userInput2) {
            System.out.println(userInput1);
        } else if (userInput2 > userInput1) {
            System.out.println(userInput2);
        } else if (userInput1 == userInput2) {
            System.out.println(userInput2);
        }
    }
}