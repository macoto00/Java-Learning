package thegardenapplication;

class Flower extends Plant {

    public Flower(String color) {
        super(color);
    }

    @Override
    protected int getWaterThreshold() {
        return 5;
    }

    @Override
    protected double getWaterAbsorption() {
        return 0.75;
    }
}