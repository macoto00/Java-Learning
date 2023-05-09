package filemanipulation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class ListIntroduction1 {
    public static void main(String[] args) {

        //        create a list "names"
        ArrayList<String> names = new ArrayList<>();

        //        print out the number of elements in the list
        System.out.println(names.size());

        //        Add "William" to the list
        names.add("William");

        //        Print out whether the list is empty or not
        System.out.println(names.isEmpty());

        //        Add "John" to the list
        names.add("John");

        //        Add "Amanda" to the list
        names.add("Amanda");

        //        Print out the number of elements in the list
        System.out.println(names.size());

        //        Print out the 3rd element
        System.out.println(names.get(2));

        //        Iterate through the list and print out each name
        for (String name : names) {
            System.out.println(name);
        }

        int helpToCount = 0;
        //        Iterate through the list and print out each name
        for (String name : names) {
            System.out.println((helpToCount += 1) + ". " + name);
        }
        //      Remove the 2nd element
        names.remove(1);

        //      Iterate through the list in a reversed order and print out each name
        // Generate an iterator. Start just after the last element.
        ListIterator li = names.listIterator(names.size());

        // Iterate in reverse.
        while(li.hasPrevious()) {
            System.out.println(li.previous());
        }

        // Remove all elements
        names.removeAll(names);

        // Print out the number of elements in the list
        System.out.println(names.size());
    }
}

