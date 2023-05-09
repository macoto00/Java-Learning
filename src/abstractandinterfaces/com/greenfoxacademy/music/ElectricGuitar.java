package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

    private int defaultNumberOfStrings = 6;
    private String sound = "Twang";;

    public ElectricGuitar() {
        super.setNumberOfStrings(defaultNumberOfStrings);
        this.sound = getSound();
    }


    public ElectricGuitar(int newNumberOfStrings) {
        this.setNumberOfStrings(newNumberOfStrings);
        this.sound = getSound();
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
