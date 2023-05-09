package expresionsandcontrolflow.expresionsandcontrolflow;

import java.util.Scanner;
/*public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program which prompts the user for a double value
        // specifying a distance in miles, converts that value
        // to kilometers and prints it
        //
        // Example:
        //
        // Please enter a distance in miles: 1.8
        // The distance in km: 2.88
        //
    }
}*/

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program which prompts the user for a double value
        // specifying a distance in miles, converts that value
        // to kilometers and prints it
        //
        // Example:
        //
        // Please enter a distance in miles: 1.8
        // The distance in km: 2.88
        //

        System.out.println("Please enter a distance in miles: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        double userInput1 = scanner.nextDouble();

        // convertion
        double convert = userInput1 * 1.609344;

        // It prints the line
        System.out.println("The distance in km: " + convert);
    }
}