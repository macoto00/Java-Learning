package com.greenfoxacademy.music;

abstract class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public abstract void sound();

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
}
