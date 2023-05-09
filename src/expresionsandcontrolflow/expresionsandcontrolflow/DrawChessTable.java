package expresionsandcontrolflow.expresionsandcontrolflow;//public class DrawChessTable {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a chess table of the specified size
//        //
//        // Example:
//        //
//        // Please enter the chess table size: 8
//        // % % % %
//        //  % % % %
//        // % % % %
//        //  % % % %
//        // % % % %
//        //  % % % %
//        // % % % %
//        //  % % % %
//    }
//
//    public static void draw(int size){
//        // Write your code to draw the chess table here
//    }
//}

import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a chess table of the specified size
        //
        // Example:
        //
        // Please enter the chess table size: 8
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // Message
        System.out.print("Please enter the chess table size: ");

        // The program stops and waits for user input and to press enter
        int userInput = scanner.nextInt();

        // Call the "draw" method
        draw(userInput);

    }

    public static void draw(int size){
        // Write your code to draw the chess table here

        // Outer loop for rows
        for (int i = 0; i < size; i++) {

            // Inner loop for columns
            for (int j = 0; j < size; j++) {

                if ((i +j) % 2 == 0) {
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