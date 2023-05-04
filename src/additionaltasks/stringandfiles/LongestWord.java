package additionaltasks.stringandfiles;

public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Hello there! General Kenobi?";
        System.out.println(longestWord(sentence));
    }

    public static int longestWord (String string) {
        String longestWord = "";
        int maxLength = 0;
        String[] words = string.split(" ");
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord.length();
    }
}
