package pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        ship1.fillShip();
        System.out.println("Ship 1:");
        ship1.printShipInfo();

        Ship ship2 = new Ship();
        ship2.fillShip();
        System.out.println("\nShip 2:");
        ship2.printShipInfo();

        boolean result = ship1.battle(ship2);
        if (result) {
            System.out.println("\nShip 1 wins!");
        } else {
            System.out.println("\nShip 2 wins!");
        }
    }
}
