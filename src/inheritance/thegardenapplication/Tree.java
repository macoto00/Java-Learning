package thegardenapplication;

class Tree extends Plant {

    public Tree(String color) {
        super(color);
    }

    @Override
    protected int getWaterThreshold() {
        return 10;
    }

    @Override
    protected double getWaterAbsorption() {
        return 0.4;
    }
}
