package expresionsandcontrolflow.expresionsandcontrolflow;/*public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        //
        // Please enter a number: 7
        // Odd
    }
}*/

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        //
        // Please enter a number: 7
        // Odd

        System.out.print("Please enter a number: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        int userInput1 = scanner.nextInt();
        boolean even = userInput1 % 2 == 0;
        //boolean even = userInput1 % 2 != 0;

        // print
        if (even) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}
