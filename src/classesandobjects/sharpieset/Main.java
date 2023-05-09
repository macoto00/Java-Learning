package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sharpie black = new Sharpie("black", 2);
        Sharpie blue = new Sharpie("blue", 4);
        Sharpie red = new Sharpie("red", 2);
        Sharpie yellow = new Sharpie("yellow", 8);

        SharpieSet sharpiesSet = new SharpieSet();

        sharpiesSet.addSharpie(black);
        sharpiesSet.addSharpie(blue);
        sharpiesSet.addSharpie(red);
        sharpiesSet.addSharpie(yellow);

        System.out.println("Fresh new SharpieSet contains following Sharpies: ");
        sharpiesSet.showSharpies();

        black.use();
        blue.use();
        red.use();
        red.use();

        System.out.println("Used SharpieSet contains following Sharpies: ");
        sharpiesSet.showSharpies();

        System.out.println("The number of usable Sharpies: " + sharpiesSet.countUsable());

        red.use();
        red.use();
        red.use();
        red.use();
        red.use();
        red.use();
        red.use();
        red.use();
        red.use();

        System.out.println("-- After full use of the red --");
        System.out.println("The number of usable Sharpies: " + sharpiesSet.countUsable());
    }
}
