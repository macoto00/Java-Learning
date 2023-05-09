package expresionsandcontrolflow.expresionsandcontrolflow;//public class DrawDiamond {
//    public static void main(String[] args) {
//        // Write a program that reads a number from the standard input and
//        // then draws a diamond of the specified height
//        //
//        // Example:
//        //
//        // Please enter the diamond height: 4
//        //    *
//        //   ***
//        //  *****
//        // *******
//        //  *****
//        //   ***
//        //    *
//        //
//        // Note: the height of the diamond is taken from its base
//        // (where it is the widest) to the top.
//        // The total number of lines produced is 2*height-1
//    }
//
//    public static void draw(int size){
//        // Write your code to draw the diamond here
//    }
//}

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a diamond of the specified height
        //
        // Example:
        //
        // Please enter the diamond height: 4
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // Note: the height of the diamond is taken from its base
        // (where it is the widest) to the top.
        // The total number of lines produced is 2*height-1

        // Creates a scanner
        Scanner scanner = new Scanner(System.in);

        // Message
        System.out.print("Please enter the diamond height: ");

        // The program stops and waits for user input and to press enter
        int userInput = scanner.nextInt();
        draw(userInput);
    }

    public static void draw(int size){
        // Write your code to draw the diamond here
        // Upper part of the triangle
        for (int i = 1; i < size; i++) {
            for (int j = i; j <= size; j++) {
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

        // Lower part of the triangle
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < size; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}