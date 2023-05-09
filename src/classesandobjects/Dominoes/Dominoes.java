package Dominoes;

import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        List<Domino> orderedDominoes = new ArrayList<>();
        orderedDominoes.add(dominoes.get(0)); // add the first domino to the ordered list
        dominoes.remove(0); // remove the first domino from the original list

        while (!dominoes.isEmpty()) {
            int lastRight = orderedDominoes.get(orderedDominoes.size() - 1).getRightSide();

            for (int i = 0; i < dominoes.size(); i++) {
                if (dominoes.get(i).getLeftSide() == lastRight) {
                    orderedDominoes.add(dominoes.get(i)); // add the matching domino to the ordered list
                    dominoes.remove(i); // remove the matching domino from the original list
                    break; // stop searching for a matching domino
                }
            }
        }

        System.out.println(orderedDominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
