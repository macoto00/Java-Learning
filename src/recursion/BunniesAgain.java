package recursion;
// We have bunnies standing in a line numbered as 1, 2, ... The "odd" bunnies
// (1, 3, ...) have the usual number of ears = 2. However, the even bunnies
// (2, 4, ...) have 3 ears each (because they have a raised foot). Write
// a recursive method which accepts the number of bunnies as a parameter
// and returns the total number of "ears" in the bunny line. The method should be
// able to handle invalid input (e.g. negative numbers).

public class BunniesAgain {
    public static void main(String[] args) {

        System.out.println(bunniesAgain(5, 0));

    }

    public static int bunniesAgain(int bunnies, int ears) {

        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 != 0) {
            return ears + 2 + bunniesAgain(bunnies - 1, ears);
        } else {
            return ears + 3 + bunniesAgain(bunnies - 1, ears);
        }

        // if bunnies % 2 == 0 then ears + 2 && if bunnies % 2 != 0 then ears + 3
    }
}
