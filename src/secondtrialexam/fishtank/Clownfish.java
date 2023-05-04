package com.gfa.exam.fishtank;

public class Clownfish extends Fish {
    private final String stripeColor;
    public Clownfish(String name, String color, String stripeColor) {
        super(name, color);
        this.stripeColor = stripeColor;
    }

    @Override
    public int feed() {
        return setWeight(getWeight() + 1);
    }

    @Override
    public String getStatus() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", stripe color: " + getStripeColor();
    }

    public String getStripeColor() {
        return stripeColor;
    }
}
