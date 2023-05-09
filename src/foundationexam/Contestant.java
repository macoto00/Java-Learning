package com.gfa.exam;

public class Contestant {
    private String name;
    private int placement;

    public Contestant(String name) {
        this.name = name;
        this.placement = 0;
    }

    public int getPlacement() {
        return placement;
    }

    public void setPlacement(int value) {
        if (value < 0) {
            placement = getPlacement();
        } else {
            this.placement = value;
        }
    }
    public String toString () {
        return name + "has finished on place: " + placement;
    }
}
