package recursion;
// Given base and n that are both 1 or more, write a recursive method (no loops)
// which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).

public class Power {

    public static void main(String[] args) {

        System.out.println(powerN(3, 3));

    }

    public static int powerN(int base, int n) {

        if (n == 0) {
            return 1;
        } else {
            return base * powerN(base, n-1);
        }
    }
}
