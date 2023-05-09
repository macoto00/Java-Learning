package pirates;

public class WarApp {
    public static void main(String[] args) {
        Armada armada1 = new Armada();
        armada1.fillArmada();

        Armada armada2 = new Armada();
        armada2.fillArmada();

        boolean result = armada1.war(armada2);
        if (result) {
            System.out.println("\nArmada 1 wins!");
        } else {
            System.out.println("\nArmada 2 wins!");
        }
    }
}
