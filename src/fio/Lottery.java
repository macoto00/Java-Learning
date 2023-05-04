package fio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lottery {

    public static int[] getMostFrequentNumbers(String fileName) {
        int[] result = new int[5];

        Map<Integer, Integer> numberCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                for (int i = 4; i < 9; i++) {
                    int number = Integer.parseInt(parts[i]);
                    numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
                }
            }
        } catch (IOException e) {
            return result;
        }

        int[] sortedNumbers = numberCount.keySet().stream()
                .sorted((n1, n2) -> numberCount.get(n2) - numberCount.get(n1))
                .mapToInt(n -> n)
                .toArray();

        for (int i = 0; i < 5 && i < sortedNumbers.length; i++) {
            result[i] = sortedNumbers[i];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMostFrequentNumbers("src/main/resources/static/lottery.csv")));
    }
}
