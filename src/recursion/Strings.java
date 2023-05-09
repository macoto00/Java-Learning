package recursion;
// Given a string, write a recursive (no loops) method which returns
// a new string with the lowercase 'x' chars changed to 'y' chars.

public class Strings {
    public static void main(String[] args) {

        String string = "xaxax";
        System.out.println(replaceXWithY(string));

    }

    public static String replaceXWithY(String str) {

        if (str.isEmpty()) {
            return "";
        } else if (str.charAt(0) == 'x') {
            return 'y' + replaceXWithY(str.substring(1));
        } else {
            return str.charAt(0) + replaceXWithY(str.substring(1));
        }
    }
}
