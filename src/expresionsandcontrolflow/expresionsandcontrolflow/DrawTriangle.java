package expresionsandcontrolflow.expresionsandcontrolflow;/*public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****
    }

    public static void draw(int height){
        // Write your code to draw the triangle here
    }
}*/

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // Message
        System.out.print("Please enter the triangle height: ");

        // The program stops and waits for user input and to press enter
        int userInput = scanner.nextInt();
        draw(userInput);
    }

    public static void draw(int height) {
        // Write your code to draw the triangle here

        // Rows
        for (int i = 1; i <= height ; i++) {
            // Columns
            for (int j = 1; j <= i ; j++) {
                // Print on line
                System.out.print("* ");
            }
            // New line
            System.out.println();
        }
    }
}

/*cube
for (int i = 1; i <= height ; i++) {            // rows
        for (int j = 1; j <= height ; j++) {        // columns
        System.out.print("* ");
        }
        System.out.println();                       // new line
        }*/
