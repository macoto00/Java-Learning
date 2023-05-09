package printableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creating a list of Dominoes
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        System.out.println("Sorting the Dominoes");
        Collections.sort(dominoes);

        // Print the sorted list
        for (Domino d : dominoes) {
            System.out.print(d);
        }
        // the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]

        System.out.println();

        // Creating a list of Todos
        List<Todo> todos = new ArrayList<>();
        todos.add(new Todo("Buy milk", "high", true));
        todos.add(new Todo("Do laundry", "medium", false));
        todos.add(new Todo("Clean room", "low", false));

        System.out.println();
        System.out.println("Print all fields of Dominoes and ToDos");

        // Printing all fields of Dominoes
        for (Domino d : dominoes) {
            d.printAllFields();
        }

        System.out.println();

        // Printing all fields of Todos
        for (Todo t : todos) {
            t.printAllFields();
        }

        System.out.println();

        System.out.println(todos);
    }
}
