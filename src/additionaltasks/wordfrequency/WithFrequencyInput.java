package additionaltasks.wordfrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class WithFrequencyInput {
    public static void main(String[] args) {
        System.out.print("How many occurencies do you want? ");
        Scanner scanner = new Scanner(System.in);
        int occurrence = scanner.nextInt();
        String string = "This is really very very nice sentence, it is really good for practice!";
        // System.out.println(wordToAMap(string));
        for (Map.Entry<String, Integer> entry : wordToAMap(string,occurrence).entrySet()) {
            System.out.print('"' + entry.getKey() + '"' + ": ");
            System.out.print(entry.getValue() + ",");
            System.out.println();
        }
    }

    public static HashMap<String, Integer> wordToAMap(String string, int occurrence) {
        HashMap<String, Integer> freqMap = new HashMap<>();
        String[] words = string.split("\\W+");

        for (String word : words) {
            int counter = freqMap.getOrDefault(word, 0);
            freqMap.put(word, counter + 1);
        }

        freqMap.entrySet().removeIf(entry -> entry.getValue() < occurrence);

        return freqMap;
    }
}
