package pirates;

import java.util.Random;

public class Pirate {
    private int intoxicationLevel;
    private boolean isAlive;
    private Parrot parrot;

    public Pirate() {
        this.intoxicationLevel = 0;
        this.isAlive = true;
        this.parrot = null;
    }

    public void drinkSomeRum() {
        if (isAlive) {
            intoxicationLevel++;
        } else {
            System.out.println("He's dead.");
        }
    }

    public void howsItGoingMate() {
        if (isAlive) {
            if (intoxicationLevel < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passOut();
            }
        } else {
            System.out.println("He's dead.");
        }
    }

    private void passOut() {
        intoxicationLevel = 0;
    }

    public void brawl(Pirate otherPirate) {
        if (isAlive && otherPirate.isAlive) {
            Random random = new Random();
            int upperbound = 3;
            int outcome = random.nextInt(upperbound);
            switch (outcome) {
                case 0:
                    die();
                    break;
                case 1:
                    otherPirate.die();
                    break;
                case 2:
                    passOut();
                    otherPirate.passOut();
                    break;
            }
        } else {
            System.out.println("He's dead.");
        }
    }

    public void die() {
        isAlive = false;
    }

    public void addParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public int getIntoxicationLevel() {
        return intoxicationLevel;
    }

    public void setIntoxicationLevel(int intoxicationLevel) {
        this.intoxicationLevel = intoxicationLevel;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
