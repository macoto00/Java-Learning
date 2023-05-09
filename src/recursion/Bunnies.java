package recursion;
// We have a number of bunnies and each bunny has two big floppy ears. Write
// a recursive method (no loops or multiplication) which takes the number of
// bunnies as its sole parameter and returns the total number of ears
// the bunnies have. The method should be able to handle invalid input
// (e.g. negative numbers)

public class Bunnies {
    public static void main(String[] args) {

        System.out.println(bunnies(10, 2));

    }

    public static int bunnies(int bunnies, int ears) {

        if (bunnies == 0) {
            return 0;
        } else {
            return ears + bunnies(bunnies - 1, ears);
        }
    }
}
