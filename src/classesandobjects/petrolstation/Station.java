package petrolstation;

public class Station {
    private int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        if (gasAmount == 0) {
            System.out.println("I have no gas, can't refill your car!");
        } else if (gasAmount >= car.getGasAmount()) {
            car.setGasAmount();
            setGasAmount(car);
        }
    }

    public int setGasAmount(Car car) {
        return gasAmount -= car.getGasAmount();
    }

    public int getGasAmount() {
        return gasAmount;
    }
}
