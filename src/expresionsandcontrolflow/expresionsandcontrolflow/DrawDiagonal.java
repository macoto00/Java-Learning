package expresionsandcontrolflow.expresionsandcontrolflow;//public class DrawDiagonal {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a square with the main diagonal of the specified size
//        //
//        // Example:
//        //
//        // Please enter the square size: 6
//        // %%%%%%
//        // %%   %
//        // % %  %
//        // %  % %
//        // %   %%
//        // %%%%%%
//        //
//    }
//
//    public static void draw(int size){
//        // Write your code to draw a square with the main diagonal here
//    }
//}

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a square with the main diagonal of the specified size
        //
        // Example:
        //
        // Please enter the square size: 6
        // %%%%%%
        // %%   %
        // % %  %
        // %  % %
        // %   %%
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

    // in progress

    public static void draw(int size){
        // Write your code to draw a square with the main diagonal here

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {

            // Inner loop for columns
            for (int j = 1; j <= size; j++) {

                boolean isDiagonal = i == j;
                if ((i == 1 || j == 1 || i == size || j == size) || isDiagonal) {
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