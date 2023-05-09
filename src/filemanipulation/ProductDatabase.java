package filemanipulation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    //    We are going to represent our products in a map where the keys are strings
    //    representing the product's name and the values are numbers representing the product's price.
//
//    Create a products map with the following key-value pairs:
//
//    Product name (key)	Price (value)
//    Eggs	200
//    Milk	200
//    Fish	400
//    Apples	150
//    Bread	50
//    Chicken	550
//    Create an application which prints out the answers to the following questions:
//
//    How much is the fish?
//    What is the most expensive product?
//    What is the average price?
//    How many products' price is below 300?
//    Is there anything we can buy for exactly 125?
//    What is the cheapest product?
//    The full output of your main method should be the following:
//
//    400
//    Chicken
//    258.33334
//    4
//    no
//    Bread

//    Autograder Bonus
//    Java: make the products map a class constant (declared as static final)
    public static void main(String[] args) {
        HashMap<String, Integer> database = new HashMap<>();

        database.put("Eggs", 200);
        database.put("Milk", 200);
        database.put("Fish", 400);
        database.put("Apples", 150);
        database.put("Bread", 50);
        database.put("Chicken", 550);

        completeAnswer(database);
    }

    private static void completeAnswer(HashMap<String, Integer> database) {
        //    How much is the fish?
        System.out.println((int)database.get("Fish"));

        //    What is the most expensive product?
        int maxValueInMap = (Collections.max(database.values()));
        for (Map.Entry<String, Integer> entry :
                database.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());
            }
        }

        //    What is the average price?
        int sum = 0;
        for (int price : database.values()) {
            sum += price;
        }
        double averagePrice = (double) sum / database.size();
        System.out.println(averagePrice);

        //    How many products' price is below 300?
        int counter = 0;
        for (int price : database.values()) {
            if (price < 300) {
                counter += 1;
            }
        }
        System.out.println(counter);

        //    Is there anything we can buy for exactly 125?
        int yes = 0;
        int no = 0;
        for (Map.Entry<String, Integer> entry :
                database.entrySet()) {
            if (entry.getValue() == 100) {
                yes += 1;
            } else {
                no += 1;
            }
        }
        if (yes > 0) {
            System.out.println("yes");
        } else if (no > 0) {
            System.out.println("no");
        }

        //    What is the cheapest product?
        int minValueInMap = (Collections.min(database.values()));
        for (Map.Entry<String, Integer> entry :
                database.entrySet()) {
            if (entry.getValue() == minValueInMap) {
                System.out.println(entry.getKey());
            }
        }
    }
}
