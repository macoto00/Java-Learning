package farm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        System.out.println("hunger = " + lion.getHunger() + ", thirst = " + lion.getThirst());
        lion.eat();
        lion.eat();
        lion.eat();
        lion.drink();
        lion.drink();
        System.out.println("hunger = " + lion.getHunger() + ", thirst = " + lion.getThirst());
        lion.play();
        System.out.println("hunger = " + lion.getHunger() + ", thirst = " + lion.getThirst());
        Animal elephant = new Animal(4, 8);
        Animal cat = new Animal(38, 12);

        Farm farm = new Farm(5);

        farm.addAnimal(lion);
        farm.addAnimal(elephant);
        farm.addAnimal(cat);

        farm.showFarm();
        farm.showAnimal();

        farm.bree();
        farm.bree();
        farm.bree();
        farm.bree();

        farm.showFarm();
        farm.showAnimal();

        farm.sell();

        farm.showFarm();
        farm.showAnimal();

    }
}
