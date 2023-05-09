package expresionsandcontrolflow.expresionsandcontrolflow;//public class VariableMutation {
//    public static void main(String[] args) {
//        int a = 3;
//        // increase the value of variable "a" by 10
//
//        System.out.println(a);
//
//        int b = 100;
//        // decrease the value of b by 7
//
//        System.out.println(b);
//
//        int c = 44;
//        // double the value of c
//
//        System.out.println(c);
//
//        int d = 125;
//        // divide the value of d by 5
//
//        System.out.println(d);
//
//        int e = 8;
//        // cube the value of e
//
//        System.out.println(e);
//
//        int f1 = 123;
//        int f2 = 345;
//        // determine if f1 is greater than f2 (print as a boolean)
//
//        int g1 = 350;
//        int g2 = 200;
//        // determine if double the value of g2 is greater
//        // than g1 (print as a boolean)
//
//        int h = 135798745;
//        // determine if h has 11 as a divisor (print as a boolean)
//
//        int i1 = 10;
//        int i2 = 3;
//        // determine if i1 is greater than i2 squared and smaller than i2 cubed
//        // (print as a boolean)
//
//        int j = 1521;
//        // determine if j is divisible by 3 or 5 (print as a boolean)
//    }
//}

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // increase the value of variable "a" by 10

        System.out.println(a += 10);

        int b = 100;
        // decrease the value of b by 7

        System.out.println(b -= 7);

        int c = 44;
        // double the value of c

        System.out.println(c * 2);

        int d = 125;
        // divide the value of d by 5

        System.out.println(d / 5);

        int e = 8;
        // cube the value of e

        System.out.println((int) Math.pow(e, 3));

        int f1 = 123;
        int f2 = 345;

        // determine if f1 is greater than f2 (print as a boolean)
        boolean greater = (f1 > f2);
        System.out.println(greater);


        int g1 = 350;
        int g2 = 200;
        // determine if double the value of g2 is greater
        // than g1 (print as a boolean)
        boolean greater2 = ((g2 * 2) > g1);
        System.out.println(greater2);

        int h = 135798745;
        // determine if h has 11 as a divisor (print as a boolean)
        boolean divisor = (135798745 % 11 == 0);
        System.out.println(divisor);

        int i1 = 10;
        int i2 = 3;
        // determine if i1 is greater than i2 squared and smaller than i2 cubed
        // (print as a boolean)
        boolean squared = ((i1 > (Math.pow(i2, 2))) && (i1 < (Math.pow(i2, 3))));
        System.out.println(squared);

        int j = 1521;
        // determine if j is divisible by 3 or 5 (print as a boolean)
        boolean determine = ((j % 3 == 0) || (j % 5 == 0));
        System.out.println(determine);
    }
}