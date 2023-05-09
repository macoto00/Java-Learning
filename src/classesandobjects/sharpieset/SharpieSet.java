package sharpieset;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    private List<Sharpie> listOfSharpies;

    public SharpieSet() {
        this.listOfSharpies = new ArrayList<>();
    }

    public void addSharpie(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }

    public void showSharpies () {
        for (sharpieset.Sharpie sharpie : listOfSharpies) {
            System.out.println(" - Color: " + sharpie.getColor() +
                    ", Width: " + sharpie.getWidth() +
                    ", Ink amount: " + sharpie.getInkAmount());
        }
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.getInkAmount() > 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash() {
        listOfSharpies.removeIf(sharpie -> sharpie.getInkAmount() == 0);
    }
}
