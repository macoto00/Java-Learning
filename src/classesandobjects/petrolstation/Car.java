package petrolstation;

public class Car {

    private int gasAmount = 0;
    private int capacity = 100;

    public int setGasAmount() {
        if (gasAmount == 100) {
            System.out.println("You have full gas capacity!");
            return gasAmount;
        } else if (gasAmount == 0) {
            return gasAmount += capacity;
        } else {
            return gasAmount += capacity - gasAmount;
        }
    }

    public int getGasAmount() {
        return gasAmount;
    }
}
