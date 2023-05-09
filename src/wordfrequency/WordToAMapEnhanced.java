package additionaltasks.wordfrequency;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Objects;

public class WordToAMapEnhanced {
    public static void main(String[] args) {
        String string = "This is really very very nice sentence, it is really good for practice!";
        for (Map.Entry<String, Integer> entry : wordToAMap(string).entrySet()) {
            System.out.print(entry.getKey() + " : ");
            System.out.print(entry.getValue());
            System.out.println();
        }
    }

    public static HashMap<String, Integer> wordToAMap(String string) {
        HashMap<String, Integer> freqMap = new HashMap<>();
        String[] words = string.split("\\W+");

        for (String word : words) {
            int counter = freqMap.getOrDefault(word, 0);
            freqMap.put(word, counter + 1);
        }

        return freqMap;
    }
}

