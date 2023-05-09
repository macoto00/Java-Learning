package expresionsandcontrolflow.expresionsandcontrolflow;//public class DrawSquare {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a square of the specified size
//        //
//        // Example:
//        //
//        // Please enter the square size: 6
//        // %%%%%%
//        // %    %
//        // %    %
//        // %    %
//        // %    %
//        // %%%%%%
//        //
//    }
//
//    public static void draw(int size){
//        // Write your code to draw the square here
//    }
//}

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a square of the specified size
        //
        // Example:
        //
        // Please enter the square size: 6
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // Message
        System.out.print("Please enter the square size: ");

        // The program stops and waits for user input and to press enter
        int userInput = scanner.nextInt();
        draw(userInput);
    }

    public static void draw(int size){
        // Write your code to draw the square here

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {

            // Inner loop for columns
            for (int j = 1; j <= size; j++) {

                if (i == 1 || j == 1 || i == size || j == size) {
                    System.out.print("%");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}