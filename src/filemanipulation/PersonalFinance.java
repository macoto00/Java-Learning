package filemanipulation;

import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        /*
        We are going to represent our expenses in a list containing integers.

        Create a list with the following items:

        500, 1000, 1250, 175, 800 and 120
        Create an application which prints out the answers to the following questions:
        How much did we spend?
        Which was our greatest expense?
        Which was our cheapest spending?
        What was the average amount of our spendings? (print this as a float value)
        */

        // creating list
        ArrayList<Integer> expenses = new ArrayList<>();

        // adding items to the list
        expenses.add(500);
        expenses.add(1000);
        expenses.add(1250);
        expenses.add(175);
        expenses.add(800);
        expenses.add(120);

        // call the function
        answers(expenses);

    }
    // creating a function (app) which prints out the answers to the questions
    public static void answers (ArrayList < Integer > answer) {
        //  How much did we spend?
        int sum = 0;
        for (int i : answer)
            sum += i;
        // System.out.println("How much did we spend?");
        System.out.println(sum);

        //  Which was our greatest expense?
        int greates = Collections.max(answer);
        // System.out.println("Which was our greatest expense?");
        System.out.println(greates);

        //  Which was our cheapest spending?
        int cheapest = Collections.min(answer);
        // System.out.println("Which was our cheapest spending?");
        System.out.println(cheapest);

        //  What was the average amount of our spendings? (print this as a float value)
        float average = (float) sum  / answer.size();
        // System.out.println("What was the average amount of our spendings? (print this as a float value)");
        System.out.println(average);

    }
}
