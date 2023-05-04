package com.gfa.exam.fishtank;

public class Fish {
    private String name;
    private int weight;
    private String color;

    public Fish(String name, String color) {
        this.name = name;
        this.color = color;
        this.weight = 2;
    }

    public String getStatus() {
        return null;
    }
    public int feed() {
        return 0;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int setWeight(int weight) {
        this.weight = weight;
        return weight;
    }
}
