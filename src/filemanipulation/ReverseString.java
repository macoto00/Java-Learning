package filemanipulation;

public class ReverseString {
    public static void main(String... args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a string which is passed as parameter
        // The method should return the reversed string
        // Pass the `toBeReversed` variable to this method to check if it works well
        // At first, solve this task using the `charAt()` function
        // Try other solutions when you are done

        // Pass the `toBeReversed` variable to this method to check if it works well
        // with reverse
//        reverse(toBeReversed);
//        System.out.println(reverse(toBeReversed));

        // with `charAt()`
        reverse(toBeReversed);
        System.out.println(reverse(toBeReversed));

        // The method should return the reversed string
        // System.out.println(reverse(toBeReversed));
    }

    // Create a method that can reverse a string which is passed as parameter
    // with reverse
    //    public static String reverse (String reversed) {
    //        StringBuilder sb = new StringBuilder(reversed);
    //        sb.reverse();
    //        return sb.toString();
    //    }

    public static String reverse (String reversed) {
        String reversedString = "";
        for (int i = reversed.length(); i > 0; i--) {
            reversedString = reversedString + reversed.charAt(i - 1);
        }
        return reversedString;
    }
}