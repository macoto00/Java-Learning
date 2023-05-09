package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Armada {
    private List<Ship> ships;

    public Armada() {
        this.ships = new ArrayList<>();
    }

    public void fillArmada() {
        int numShips = new Random().nextInt(10) + 1;
        for (int i = 0; i < numShips; i++) {
            Ship ship = new Ship();
            ship.fillShip();
            ships.add(ship);
        }
    }

    public boolean war(Armada otherArmada) {
        int thisIndex = 0;
        int otherIndex = 0;
        while (thisIndex < this.ships.size() && otherIndex < otherArmada.ships.size()) {
            Ship thisShip = this.ships.get(thisIndex);
            Ship otherShip = otherArmada.ships.get(otherIndex);
            boolean result = thisShip.battle(otherShip);
            if (result) {
                otherIndex++;
            } else {
                thisIndex++;
            }
        }

        return otherIndex == otherArmada.ships.size();
    }
}
