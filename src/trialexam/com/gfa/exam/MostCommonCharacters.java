package com.gfa.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharacters {

    public static Map<Character, Integer> getTwoMostCommonCharacters(String filename) throws IOException {
        // Create a map to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Read the file and update the frequency map
        Path filePath = Paths.get(filename);
        List<String> lines = Files.readAllLines(filePath);
        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Find the two most common characters
        Map.Entry<Character, Integer> mostCommon = null;
        Map.Entry<Character, Integer> secondMostCommon = null;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (mostCommon == null || entry.getValue() > mostCommon.getValue()) {
                secondMostCommon = mostCommon;
                mostCommon = entry;
            } else if (secondMostCommon == null || entry.getValue() > secondMostCommon.getValue()) {
                secondMostCommon = entry;
            }
        }

        // Create a map to store the result
        Map<Character, Integer> result = new HashMap<>();
        assert mostCommon != null;
        result.put(mostCommon.getKey(), mostCommon.getValue());
        assert secondMostCommon != null;
        result.put(secondMostCommon.getKey(), secondMostCommon.getValue());
        return result;
    }
}

