package thegardenapplication;

abstract class Plant {

    private String color;
    private int waterAmount;

    public Plant(String color) {
        this.color = color;
        this.waterAmount = 0;
    }

    public boolean needsWater() {
        return (waterAmount < getWaterThreshold());
    }

    public void water(int amount) {
        waterAmount += (int) (amount * getWaterAbsorption());
    }

    protected abstract int getWaterThreshold();

    protected abstract double getWaterAbsorption();

    public String toString() {
        return "The " + color + " " + getClass().getSimpleName() + " "
                + (needsWater() ? "needs" : "doesn't need") + " water";
    }
}
