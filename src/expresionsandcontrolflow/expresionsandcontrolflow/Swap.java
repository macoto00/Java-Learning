package expresionsandcontrolflow.expresionsandcontrolflow;/*public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables without changing the following 2 lines of code
        int a = 123;
        int b = 526;

        // Write your code here:

        System.out.println(a);
        System.out.println(b);
    }
}*/

/*public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables without changing the following 2 lines of code
        int a = 123;
        int b = 526;

        // Write your code here:

        a = a ^ b ^ (b = a);

        System.out.println(a);
        System.out.println(b);
    }
}*/

public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables without changing the following 2 lines of code
        int a = 123;
        int b = 526;
        int temp;

        // Write your code here:

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }
}