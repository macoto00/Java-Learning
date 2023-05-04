package com.gfa.exam.fishtank;

public class Kong extends Fish {
    public Kong(String name, String color) {
        super(name, color);
    }

    @Override
    public int feed() {
        return setWeight(getWeight() + 2);
    }

    @Override
    public String getStatus() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor();
    }
}
