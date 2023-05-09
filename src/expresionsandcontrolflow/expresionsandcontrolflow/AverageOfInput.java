package expresionsandcontrolflow.expresionsandcontrolflow;

import java.util.Scanner;

/*public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4
        //
    }
}*/

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4
        //

        System.out.print("Please enter a number: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        int userInput1 = scanner.nextInt();

        System.out.print("Please enter a number: ");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput2 = scanner.nextInt();

        System.out.print("Please enter a number: ");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput3 = scanner.nextInt();

        System.out.print("Please enter a number: ");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput4 = scanner.nextInt();

        System.out.print("Please enter a number: ");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput5 = scanner.nextInt();

        int sum = userInput1 + userInput2 + userInput3 + userInput4 + userInput5;
        float avg = (float) (userInput1 + userInput2 + userInput3 + userInput4 + userInput5) / 5;

        // It prints the line
        System.out.print("Sum: " + sum + "," + " Average: " + avg);
    }
}