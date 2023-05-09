package com.greenfoxacademy.music;

public abstract class Instrument {
    protected String name;

    abstract void play();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
