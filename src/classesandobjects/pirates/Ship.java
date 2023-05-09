package pirates;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

    private List<Pirate> crew;
    private Pirate captain;

    public Ship() {
        this.crew = new ArrayList<>();
    }

    public void fillShip() {
        if (this.captain == null) {
            this.captain = new Pirate();
        }

        Random random = new Random();
        int maxPirates = 113;
        int numPirates = random.nextInt(maxPirates);
        for (int i = 0; i < numPirates; i++) {
            Pirate pirate = new Pirate();
            this.crew.add(pirate);
        }
    }

    public void printShipInfo() {
        int alivePirates = 0;
        int consumedRum = captain.getIntoxicationLevel();

        for (Pirate pirate : crew) {
            if (pirate.isAlive()) {
                alivePirates++;
            }
        }

        System.out.println("Captain rum consumed: " + consumedRum);
        System.out.println("Captain state: " + (captain.isAlive() ? "alive" : "dead"));
        System.out.println("Number of alive pirates in the crew: " + alivePirates);
    }

    public boolean battle(Ship otherShip) {
        int score = crew.size() - captain.getIntoxicationLevel();
        int otherScore = otherShip.crew.size() - otherShip.captain.getIntoxicationLevel();

        if (score > otherScore) {
            celebrateVictory();
            otherShip.sufferDefeat();
            return true;
        } else if (score < otherScore) {
            sufferDefeat();
            otherShip.celebrateVictory();
            return false;
        } else {
            // In case of a tie, randomly determine the winner
            Random random = new Random();
            boolean thisShipWins = random.nextBoolean();
            if (thisShipWins) {
                celebrateVictory();
                otherShip.sufferDefeat();
            } else {
                sufferDefeat();
                otherShip.celebrateVictory();
            }
            return thisShipWins;
        }
    }

    private void sufferDefeat() {
        Random random = new Random();
        int numLosses = random.nextInt(crew.size() + 1);
        for (int i = 0; i < numLosses; i++) {
            int index = random.nextInt(crew.size());
            Pirate pirate = crew.get(index);
            if (pirate.isAlive()) {
                pirate.die();
            }
        }
    }

    private void celebrateVictory() {
        Random random = new Random();
        int numDrinks = random.nextInt(10) + 1;
        captain.drinkSomeRum();
        for (Pirate pirate : crew) {
            if (pirate.isAlive()) {
                pirate.drinkSomeRum();
            }
        }
        System.out.println("The victorious crew celebrates with " + numDrinks + " drinks!");
    }
}
