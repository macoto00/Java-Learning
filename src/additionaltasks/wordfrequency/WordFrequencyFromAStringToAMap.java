package additionaltasks.wordfrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.util.Collections.replaceAll;

public class WordFrequencyFromAStringToAMap {
    public static void main(String[] args) {
        String string = "This is really very very nice sentence, it is really good for practice!";
        // System.out.println(wordToAMap(string));
        for (Map.Entry<String, Integer> entry : wordToAMap(string).entrySet()) {
            System.out.print(entry.getKey() + " : ");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }

    public static HashMap<String, Integer> wordToAMap(String string) {
        HashMap freqMap = new HashMap<>();
        String[] words = string.split(" ");

        for (String word : words) {
            int counter = 0;
            for (String s : words) {
                if (Objects.equals(word, s)) {
                    counter++;
                }
                freqMap.put(word, counter);
            }
        }
        return freqMap;
    }
}
