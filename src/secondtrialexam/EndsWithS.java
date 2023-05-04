package com.gfa.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EndsWithS {
    public static void main(String[] args) {
        String string = "src/com/gfa/exam/file.txt";
        System.out.println();
        System.out.println(countEndWithS(string));
    }

    public static Integer countEndWithS(String string) {
        try {
            Path filePath = Paths.get(string);
            List<String> listToParse = Files.readAllLines(filePath);
            List<String> finalList = new ArrayList<>();
            for (String line : listToParse) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String cleanWord = word.replaceAll("[^a-zA-Z0-9']+", "");
                    if (cleanWord.endsWith("s")) {
                        finalList.add(cleanWord);
                    }
                }
            }
            for (String word : finalList) {
                System.out.println(word);
            }
            return finalList.size();
        } catch (IOException exception) {
            System.out.println("File not found");
            return -1;
        }
    }
}
