package com.gfa.exam.fishtank;

public class Tang extends Fish {
    private boolean shortTermMemoryLoss;
    public Tang(String name, String color, boolean shortTermMemoryLoss) {
        super(name, color);
        this.shortTermMemoryLoss = shortTermMemoryLoss;
    }
    @Override
    public int feed() {
        return setWeight(getWeight() + 1);
    }

    @Override
    public String getStatus() {
        return getName() + ", weight: " + getWeight() + ", color: " + getColor() + ", short-term memory loss: " + isShortTermMemoryLoss();
    }

    public boolean isShortTermMemoryLoss() {
        return shortTermMemoryLoss;
    }
}
