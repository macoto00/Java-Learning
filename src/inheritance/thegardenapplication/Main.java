package thegardenapplication;

import greenfoxinheritanceexercise.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Garden garden = new Garden();

        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");
        Tree purpleTree = new Tree("purple");
        Tree orangeTree = new Tree("orange");

        garden.addPlant(yellowFlower);
        garden.addPlant(blueFlower);
        garden.addPlant(purpleTree);
        garden.addPlant(orangeTree);

        garden.showPlants();

        garden.waterPlants(40);
        garden.showPlants();

        garden.waterPlants(70);
        garden.showPlants();
    }
}
