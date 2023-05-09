package thegardenapplication;

import greenfoxinheritanceexercise.Mentor;

import java.util.ArrayList;
import java.util.List;

class Garden {

    private List<Plant> plants;

    public Garden() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void showPlants() {
        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }

    public void waterPlants(int amount) {
        System.out.println("Watering with " + amount);
        List<Plant> plantsToWater = new ArrayList<>();
        for (Plant plant : plants) {
            if (plant.needsWater()) {
                plantsToWater.add(plant);
            }
        }
        if (plantsToWater.isEmpty()) {
            System.out.println("No plants need water.");
        } else {
            int waterPerPlant = amount / plantsToWater.size();
            for (Plant plant : plantsToWater) {
                plant.water(waterPerPlant);
            }
        }
    }
}
