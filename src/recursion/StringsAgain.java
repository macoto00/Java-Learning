package recursion;
// Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars removed.

public class StringsAgain {
    public static void main(String[] args) {
        String string = "axbxxcxxxxd";
        System.out.println(removeX(string));
    }

    private static String removeX(String string) {
        if (string.isEmpty()) {
            return "";
        } else if (string.charAt(0) == 'x') {
            return removeX(string.substring(1));
        } else {
            return string.charAt(0) + removeX(string.substring(1));
        }
    }
}
