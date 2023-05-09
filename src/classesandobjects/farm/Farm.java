package farm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Farm {
    private List<Animal> listOfAnimals;
    private int limit;

    public Farm(int limit) {
        this.listOfAnimals = new ArrayList<>();
        this.limit = limit;
    }

    public void bree() {
        if (this.listOfAnimals.size() < this.limit) {
            this.listOfAnimals.add(new Animal());
        }
    }

    public void sell() {
        this.listOfAnimals.sort(Comparator.comparingInt(Animal::getHunger));
        this.listOfAnimals.remove(0);
    }

    public void addAnimal (Animal animal) {
        this.listOfAnimals.add(animal);
    }

    public void showFarm () {
        System.out.println("The farm has " + this.listOfAnimals.size() + " animals.");
    }

    public void showAnimal () {
        for (farm.Animal animal : listOfAnimals) {
            System.out.println(" - Animal: " + animal.getHunger() +
                    ", " + animal.getThirst());
        }
    }

    public List<Animal> getListOfAnimals() {
        return listOfAnimals;
    }

    public void setListOfAnimals(List<Animal> listOfAnimals) {
        this.listOfAnimals = listOfAnimals;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
