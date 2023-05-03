package trialexam.com.gfa.exam;

import java.util.Random;

public class Pirate {
    private String name;
    private int goldAmount;
    private int healthPoints;
    private boolean hasWoodenLeg;
    private boolean isCaptain;

    public Pirate(String name) {
        this.name = name;
        this.goldAmount = 0;
        isNotCaptain();

        Random random = new Random();
        int upperbound = 2;
        int outcome = random.nextInt(upperbound);
        switch (outcome) {
            case 0:
                this.hasWoodenLeg = true;
                break;
            case 1:
                this.hasWoodenLeg = false;
                break;
        }
    }

    public void isCaptain () {
        isCaptain = true;
    }

    public void isNotCaptain () {
        isCaptain = false;
    }

    public boolean isPoor() {
        return hasWoodenLeg && goldAmount < 15;
    }

    public String toString() {
        if (hasWoodenLeg) {
            return "Hello, I'm" + getName() + ". I have a wooden leg and" + goldAmount + "amount of gold.";
        } else {
            return "Hello, I'm" + getName() + ". I still have my real legs and" + goldAmount + "amount of gold.";
        }
    }

    public void work() {
        if (this instanceof Captain) {
            goldAmount += 4;
            healthPoints -= 3;
        } else {
            goldAmount++;
            healthPoints--;
        }
    }

    public void party() {
        if (this instanceof Captain) {
            healthPoints += 5;
        } else {
            healthPoints++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoldAmount() {
        return goldAmount;
    }

    public void setGoldAmount(int goldAmount) {
        this.goldAmount = goldAmount;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public boolean isHasWoodenLeg() {
        return hasWoodenLeg;
    }

    public void setHasWoodenLeg(boolean hasWoodenLeg) {
        this.hasWoodenLeg = hasWoodenLeg;
    }

    public void setCaptain(boolean captain) {
        isCaptain = captain;
    }
}
