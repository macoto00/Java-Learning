package com.gfa.exam.fishtank;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishs;

    public Aquarium() {
        this.fishs = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        fishs.add(fish);
    }

    public void feed() {
        for (Fish fish : fishs) {
            fish.feed();
        }
    }

    public void removeBigFish() {
        fishs.removeIf(fish -> fish.getWeight() >= 11);
    }

    public List<String> getStatus() {
        List<String> statusOfEveryFish = new ArrayList<>();
        for (Fish fish : fishs) {
            statusOfEveryFish.add(fish.getStatus());
        }
        return statusOfEveryFish;
    }
}
