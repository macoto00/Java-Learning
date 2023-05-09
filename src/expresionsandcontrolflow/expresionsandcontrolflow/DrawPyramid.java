package expresionsandcontrolflow.expresionsandcontrolflow;//public class DrawPyramid {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a pyramid of the specified height
//        //
//        // Example:
//        //
//        // Please enter the pyramid height: 4
//        //    *
//        //   ***
//        //  *****
//        // *******
//    }
//
//    public static void draw(int height){
//        // Write your code to draw the pyramid here
//    }
//}

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a pyramid of the specified height
        //
        // Example:
        //
        // Please enter the pyramid height: 4
        //    *
        //   ***
        //  *****
        // *******

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // Message
        System.out.print("Please enter the pyramid height: ");

        // The program stops and waits for user input and to press enter
        int userInput = scanner.nextInt();
        draw(userInput);
    }

    public static void draw(int height){
        // Write your code to draw the pyramid here

        for (int i = 1; i <= height; i++) {
            for (int j = i; j <= height; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}