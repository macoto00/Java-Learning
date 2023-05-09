package filemanipulation;

import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("Milk", 1.07);
        products.put("Rice", 1.59);
        products.put("Eggs", 3.14);
        products.put("Cheese", 12.60);
        products.put("Chicken Breasts", 9.40);
        products.put("Apples", 2.31);
        products.put("Tomato", 2.58);
        products.put("Potato", 1.75);
        products.put("Onion", 1.10);

        HashMap<String, Integer> bobList = new HashMap<>();
        bobList.put("Milk", 3);
        bobList.put("Rice", 2);
        bobList.put("Eggs", 2);
        bobList.put("Cheese", 1);
        bobList.put("Chicken Breasts", 4);
        bobList.put("Apples", 1);
        bobList.put("Tomato", 2);
        bobList.put("Potato", 1);

        HashMap<String, Integer> aliceList = new HashMap<>();
        aliceList.put("Rice", 1);
        aliceList.put("Eggs", 5);
        aliceList.put("Chicken Breasts", 2);
        aliceList.put("Apples", 1);
        aliceList.put("Tomato", 10);

        double bobTotal = calculateTotal(bobList, products);
        double aliceTotal = calculateTotal(aliceList, products);

        System.out.println(bobTotal);
        System.out.println(aliceTotal);

        String moreRice = compareQuantity(bobList, aliceList, "Rice");
        System.out.println(moreRice);

        String morePotato = compareQuantity(bobList, aliceList, "Potato");
        System.out.println(morePotato);

        String moreHam = compareQuantity(bobList, aliceList, "Ham");
        System.out.println(moreHam);

        String moreApples = compareQuantity(bobList, aliceList, "Apples");
        System.out.println(moreApples);

        String moreDifferentProducts = compareDifferentProducts(bobList, aliceList);
        System.out.println(moreDifferentProducts);

        String moreItems = compareTotalItems(bobList, aliceList);
        System.out.println(moreItems);
    }

    public static double calculateTotal(HashMap<String, Integer> list,
                                        HashMap<String, Double> prices) {
        double total = 0;
        for (String product : list.keySet()) {
            int quantity = list.get(product);
            double price = prices.get(product);
            total += quantity * price;
        }
        return total;
    }

    public static String compareQuantity(HashMap<String, Integer> bobList,
                                         HashMap<String, Integer> aliceList,
                                         String product) {
        if (bobList.containsKey(product) && aliceList.containsKey(product)) {
            int quantity1 = bobList.get(product);
            int quantity2 = aliceList.get(product);
            if (quantity1 > quantity2) {
                return "Bob";
            } else if (quantity1 < quantity2){
                return "Alice";
            }
        } else if (bobList.containsKey(product) && !aliceList.containsKey(product)) {
            return "Bob";
        } else if (aliceList.containsKey(product) && !bobList.containsKey(product)) {
            return "Alice";
        }
        return "no one";
    }

    private static String compareDifferentProducts(HashMap<String, Integer> bobList,
                                                   HashMap<String, Integer> aliceList) {
        if (bobList.size() > aliceList.size() ) {
            return "Bob";
        } else {
            return "Alice";
        }
    }

    private static String compareTotalItems(HashMap<String, Integer> bobList,
                                                   HashMap<String, Integer> aliceList) {
        int bobListAmount = 0;
        int aliceListAmount = 0;
        for (String product : bobList.keySet()) {
            int quantity = bobList.get(product);
            bobListAmount += quantity;
        }
        for (String product : aliceList.keySet()) {
            int quantity = aliceList.get(product);
            aliceListAmount += quantity;
        }
        if (bobListAmount > aliceListAmount) {
            return "Bob";
        } else {
            return "Alice";
        }
    }
}