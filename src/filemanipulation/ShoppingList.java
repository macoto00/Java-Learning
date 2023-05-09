package filemanipulation;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    //    We are going to represent a shopping list by a list containing strings.
//
//    Create a list with the following items:
//    eggs, milk, fish, apples, bread and chicken
//    Create an application which prints out the answers to the following questions:
//    Do we have milk in the shopping list? (yes/no)
//    Do we have bananas in the shopping list? (yes/no)
//    The full output of your main method should be the following:
//
//    yes
//    no
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");

        // print all items underneath
//        for (String item : shoppingList) {
//            System.out.println(item);
//        }

        // print all items in an array list
//        System.out.println(shoppingList);

        finder(shoppingList);
    }
    public static void finder(List<String> shoppingList) {
        System.out.println(shoppingList.contains("milk") ? "yes" : "no");
        System.out.println(shoppingList.contains("bananas") ? "yes" : "no");
    }
}
