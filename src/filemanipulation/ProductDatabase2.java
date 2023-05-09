package filemanipulation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
//    We are going to represent our products in a map where the keys are strings representing the product's name and the values are numbers representing the product's price.
//
//    Create a map with the following key-value pairs:
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
//    Which products cost less than 201? (just the name)
//    Which products cost more than 150? (name + price)
//    The full output of your main method should be the following:
//
//    Apples
//    Eggs
//    Milk
//    Bread
//    Fish 400
//    Chicken 550
//    Eggs 200
//    Milk 200

//    NOTE: Your output lines may be in a different order as the HashMap API does not define the order of iteration.

    public static void main(String[] args) {
        HashMap<String, Integer> database2 = new HashMap<>();

        database2.put("Eggs", 200);
        database2.put("Milk", 200);
        database2.put("Fish", 400);
        database2.put("Apples", 150);
        database2.put("Bread", 50);
        database2.put("Chicken", 550);

        completeAnswer(database2);
    }

    private static void completeAnswer(HashMap<String, Integer> database2) {
        //    Which products cost less than 201? (just the name)
        for (Map.Entry<String, Integer> entry :
                database2.entrySet()) {
            if (entry.getValue() < 201) {
                System.out.println(entry.getKey());
            }
        }
        //    Which products cost more than 150? (name + price)
        for (Map.Entry<String, Integer> entry :
                database2.entrySet()) {
            if (entry.getValue() > 150) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
