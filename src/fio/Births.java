package fio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Births {
    // Create a function `getMostFrequentYear` which takes the name of a CSV file as a parameter,
    // - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
    // and returns the year (as a String) when the most births happened.
    // If there were multiple years with the same number of births then return any of them.
    // If the given file doesn't exist, the function should return "File not found"
    public static String getMostFrequentYear(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            return "File not found";
        }

        Map<String, Integer> yearCounts = new HashMap<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length >= 2) {
                    String[] dateParts = parts[1].split("-");
                    if (dateParts.length >= 1) {
                        String year = dateParts[0];
                        int count = yearCounts.getOrDefault(year, 0) + 1;
                        yearCounts.put(year, count);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            return "File not found";
        }

        String mostFrequentYear = null;
        int mostFrequentCount = 0;
        for (Map.Entry<String, Integer> entry : yearCounts.entrySet()) {
            if (entry.getValue() > mostFrequentCount) {
                mostFrequentYear = entry.getKey();
                mostFrequentCount = entry.getValue();
            }
        }
        return mostFrequentYear;
    }

    // Change the path of the /births.csv source file to the path where you saved it on your computer.
    // You can find the source file in a link next to this exercise.
    public static void main(String[] args) {
        System.out.println(getMostFrequentYear("src/main/resources/static/births.csv")); // should print "2006" or "2016"
        System.out.println(getMostFrequentYear("src/main/resources/static/not-existing-file.csv")); // should print "File not found"
    }
}

