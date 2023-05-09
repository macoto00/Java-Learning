package aircraftcarrier;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircraftList;
    private int ammoStored;
    private int healthPoints;

    public Carrier(List<Aircraft> aircraftList, int ammoStored, int healthPoints) {
        this.aircraftList = new ArrayList<Aircraft>();
        this.ammoStored = ammoStored;
        this.healthPoints = healthPoints;
    }

    public void add(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public void fill () throws Exception {
        int priorityAmmo = 0;
        int nonPriorityAmmo = 0;
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.isPriority()) {
                priorityAmmo += (aircraft.getMaxAmmo() - aircraft.getAmmo());
            } else {
                nonPriorityAmmo += (aircraft.getMaxAmmo() - aircraft.getAmmo());
            }
        }

        if (ammoStored < (priorityAmmo + nonPriorityAmmo)) {
            throw new Exception("Not enough ammo!");
        }

        aircraftList.sort(Comparator.comparing(Aircraft::isPriority));

        for (Aircraft aircraft : aircraftList) {
            int ammoNeeded = aircraft.getMaxAmmo() - aircraft.getAmmo();
            if (aircraft.isPriority()) {
                int ammoToLoad = Math.min(ammoNeeded, ammoStored);
                aircraft.refillAmmo(ammoToLoad);
                ammoStored -= ammoToLoad;
            } else {
                int ammoToLoad = Math.min(ammoNeeded, Math.max(0, ammoStored - priorityAmmo));
                aircraft.refillAmmo(ammoToLoad);
                ammoStored -= ammoToLoad;
            }
        }
    }

    public int fight (Carrier carrier) {
        int totalDamage = 0;
        for (Aircraft aircraft:
                aircraftList) {
            totalDamage += aircraft.fight();
        }
        for (Aircraft aircraft:
                aircraftList) {
            aircraft.setAmmo(0);
        }
        int damage = carrier.getHealthPoints() - totalDamage;
        System.out.println("Damage done is: " + damage);
        return damage;
    }

    public void getStatus () {
        if (healthPoints == 0) {
            System.out.println("It's dead Jim :(");
        } else {
            int totalDamage = 0;
            for (Aircraft aircraft:
                 aircraftList) {
                totalDamage = aircraft.getAmmo() * aircraft.getBaseDamage();
            }
            System.out.println("HP: " + getHealthPoints() + ", Aircraft count: " + aircraftList.size() + ", Ammo Storage: " + getAmmoStored() + ", Total damage: " + totalDamage);
            System.out.println("Aircrafts: ");
            for (Aircraft aircraft:
                 aircraftList) {
                System.out.println("Type " + aircraft.getType() + ", Ammo: " + aircraft.getAmmo() + ", Base Damage: " + aircraft.getBaseDamage() + ", All damage: " + aircraft.getAmmo() + aircraft.getBaseDamage());
            }
        }
    }

    public List<Aircraft> getAircraftList() {
        return aircraftList;
    }

    public void setAircraftList(List<Aircraft> aircraftList) {
        this.aircraftList = aircraftList;
    }

    public int getAmmoStored() {
        return ammoStored;
    }

    public void setAmmoStored(int ammoStored) {
        this.ammoStored = ammoStored;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
