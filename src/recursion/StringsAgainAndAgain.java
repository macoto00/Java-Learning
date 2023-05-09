package recursion;
// Given a string, write a recursive (no loops) method which returns a new
// string with all adjacent chars separated by an `*`. Please note that there
// should be no trailing `*` at the end of the returned string. For example,
// the string `word` should be changed to `w*o*r*d`.

public class StringsAgainAndAgain {
    public static void main(String[] args) {
        String str = "word";
        System.out.println(stars(str));
    }

    private static String stars(String str) {
        if (str.isEmpty()) {
            return "";
        } else if (str.length() > 1) {
            return str.charAt(0) + "*" + stars(str.substring(1));
        } else {
            return str.charAt(0) + stars(str.substring(1));
        }
    }
}
