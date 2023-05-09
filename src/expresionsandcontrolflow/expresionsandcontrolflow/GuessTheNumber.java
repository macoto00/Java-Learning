package expresionsandcontrolflow.expresionsandcontrolflow;/*public class GuessTheNumber {
    public static void main(String[] args) {
        int storedNumber = 8;
        // Write a program that stores a number and the user has to figure it out.
        // The user can input guesses. After each guess the program responds
        // with a message indicating whether the stored number is smaller or
        // greater than the guess.
        // The program ends (exits) when the user finds the stored number
        //
        // Example:
        //
        // Please enter your guess: 3
        // The stored number is greater than 3
        // Please enter your guess: 10
        // The stored number is smaller than 10
        // Please enter your guess: 8
        // You have found the stored number 8
        //
    }
}*/

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out.
        // The user can input guesses. After each guess the program responds
        // with a message indicating whether the stored number is smaller or
        // greater than the guess.
        // The program ends (exits) when the user finds the stored number
        //
        // Example:
        //
        // Please enter your guess: 3
        // The stored number is greater than 3
        // Please enter your guess: 10
        // The stored number is smaller than 10
        // Please enter your guess: 8
        // You have found the stored number 8
        //

        // The program stops and waits for user input and to press enter

        // Guessed number
        int storedNumber = 8;
        // User guess
        int usersGuess;

        // Initial call to guess the number
        System.out.print("Please enter your guess: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // Now loop for the guesses
        while (true) {      // What the hell, I spend extreme amount of time to figure this line out (that this could be a true, not only exmpl. i < 1)

            // Assign a user command line guess
            usersGuess = scanner.nextInt();

            // Right guess
            if (usersGuess == storedNumber) {
                System.out.println("You have found the stored number " + storedNumber);
                break;
            }

            // Smaller guess
            if (usersGuess < storedNumber) {
                System.out.println("The stored number is greater than " + usersGuess);
                System.out.print("Please enter your guess: ");

            // Higher guess
            } else if (usersGuess > storedNumber) {
                System.out.println("The stored number is smaller than " + usersGuess);
                System.out.print("Please enter your guess: ");
            }
        }
    }
}