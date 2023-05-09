package fleetofthings;

import java.util.ArrayList;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main()` method
        // - Download those, use those
        // - Create a fleet in the main() method

        // - Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing standUp = new Thing("Stand up");
        standUp.complete();
        Thing eatLunch = new Thing("Eat lunch");
        eatLunch.complete();

        fleet.add(new Thing("Get Milk"));
        fleet.add(new Thing("Remove the obstacles"));
        fleet.add(standUp);
        fleet.add(eatLunch);

        System.out.println(fleet);
    }
}
