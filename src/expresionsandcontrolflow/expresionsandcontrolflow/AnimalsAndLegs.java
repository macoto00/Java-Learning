package expresionsandcontrolflow.expresionsandcontrolflow;

import java.util.Scanner;
/*public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // Print how many legs all the animals have in total
        //
        // Example
        //
        // Please enter the number of chickens: 4
        // Please enter the number of pigs: 2
        // The number of legs: 16
        //
    }
}*/

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // Print how many legs all the animals have in total
        //
        // Example
        //
        // Please enter the number of chickens: 4
        // Please enter the number of pigs: 2
        // The number of legs: 16
        //
        System.out.println("Please enter the number of chickens: ");

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // The program stops and waits for user input and to press enter
        int userInput1 = scanner.nextInt();

        System.out.println("Please enter the number of pigs: ");

        // The program stops and waits for user input that is an integer and to press enter
        int userInput2 = scanner.nextInt();

        int chickenLegs = userInput1 * 2;
        int pigsLegs = userInput2 * 4;
        int legsTogether = chickenLegs + pigsLegs;

        // It prints the line
        System.out.println("The number of legs: " + legsTogether);
    }
}