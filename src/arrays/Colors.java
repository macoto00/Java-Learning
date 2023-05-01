package arrays;

import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {
        // - Create a two-dimensional array (of Strings)
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`
        // - Print the array in the following format:
        //
        //   lime, forest green, oline, pale green, spring green
        //   orange red, red, tomato
        //   orchid, violet, pink, hot pink
        //

        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j]);
                if (j < colors[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < colors.length; i++) {
            System.out.println(Arrays.toString(colors[i]));
        }
    }
}
