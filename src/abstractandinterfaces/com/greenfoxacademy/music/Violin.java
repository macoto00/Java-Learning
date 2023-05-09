package com.greenfoxacademy.music;

public class Violin extends StringedInstrument {

    private int defaultNumberOfStrings = 4;
    private String sound;

    public Violin() {
        super.setNumberOfStrings(defaultNumberOfStrings);
        this.sound = "Screech";
    }

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + ", a " + this.getNumberOfStrings() + "-stringed instrument that goes " + getSound());
    }

    @Override
    public void sound() {
        System.out.println(getSound());
    }

    public int getDefaultNumberOfStrings() {
        return defaultNumberOfStrings;
    }

    public void setDefaultNumberOfStrings(int defaultNumberOfStrings) {
        this.defaultNumberOfStrings = defaultNumberOfStrings;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
