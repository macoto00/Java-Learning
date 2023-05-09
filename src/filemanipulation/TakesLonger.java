package filemanipulation;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it!
        // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!

        buildAString(quote);

        // System.out.println(quote);
    }

    public static void buildAString(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.insert(20, " always takes longer than");
        System.out.println(sb.toString());
    }
}