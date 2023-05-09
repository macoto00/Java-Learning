package petrolstation;

public class PetrolStation {

//    Create Station and Car classes
//              Station
//    it stores how much gas is avaliable: gasAmount
//    the gas amount must be given when we create a station
//    it can refill a car: refill(car):
//    decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
//    increases the car's gasAmount
//              Car
//    it stores how much gas is actually present: gasAmount
//    it stores the capacity of the tank: capacity
//    create a constructor for the Car class where you:
//    initialize gasAmount -> 0
//    initialize capacity -> 100

    public static void main(String[] args) {

        Station station = new Station(500);
        Car car = new Car();

        System.out.println("car: " + car.getGasAmount());
        System.out.println("station: " + station.getGasAmount());

        System.out.println("--refilling the car--");
        station.refill(car);
        System.out.println("car: " + car.getGasAmount());
        System.out.println("station: " + station.getGasAmount());

        System.out.println("--refilling the car--");
        station.refill(car);
        System.out.println("car: " + car.getGasAmount());
        System.out.println("station: " + station.getGasAmount());

    }

}
