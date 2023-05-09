package expresionsandcontrolflow.expresionsandcontrolflow;

import java.util.Scanner;
/*public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!
        //
        System.out.println("Hello, World!");
    }
}*/

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!
        //

        // create scanner
        System.out.print("Please enter your name: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        String userInput1 = scanner.nextLine();

        // It prints the line
        System.out.println("Hello, " + userInput1 + "!");
    }
}