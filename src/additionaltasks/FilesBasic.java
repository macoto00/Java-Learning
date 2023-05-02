package additionaltasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilesBasic {
    public static void main(String[] args) {
        String filePath = "src/additionaltasks/fileio.txt";
//        System.out.println(readFile(filePath));
//        System.out.println();
//        System.out.println(withoutVowels(filePath));
//        System.out.println();
//        System.out.println(vowelsIndices(filePath));
//        System.out.println();
//        System.out.println(frequencyMap(filePath));
//        System.out.println();
        sentenceToANewLine(filePath);
    }

    public static String readFile(String file) {
        Path filePath = Paths.get(file);
        try {
            List<String> lines = Files.readAllLines(filePath);
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            return "Unable to read file.";
        }
    }

    public static String withoutVowels(String file) {
        Path filePath = Paths.get(file);
        try {
            List<String> lines = Files.readAllLines(filePath);
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append("\n");
            }
            return sb.toString().replaceAll("[aeiouAEIOU]", "");
        } catch (IOException e) {
            return "Unable to read file.";
        }
    }

    public static List<Integer> vowelsIndices(String file) {
        Path filePath = Paths.get(file);
        try {
            List<String> lines = Files.readAllLines(filePath);
            StringBuilder sb = new StringBuilder();
            StringBuilder vowelsIndices = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append("\n");
            }
            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' ||
                        sb.charAt(i) == 'i' || sb.charAt(i) == 'o' ||
                        sb.charAt(i) == 'u') {
                    vowelsIndices.append(i).append(" ");
                }
            }
            ArrayList<Integer> integerList = new ArrayList<>();
            String[] indicesArray = vowelsIndices.toString().split(" ");
            for (String indexString : indicesArray) {
                integerList.add(Integer.parseInt(indexString));
            }
            return integerList;
        } catch (IOException e) {
            return null;
        }
    }

    public static Map<Character, Integer> frequencyMap(String file) {
        Path filePath = Paths.get(file);
        try {
            List<String> lines = Files.readAllLines(filePath);
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line);
            }
            HashMap<Character, Integer> charCountMap = new HashMap<>();
            char[] strArray = sb.toString().toCharArray();
            for (char c : strArray) {
                if (charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c) + 1);
                } else {
                    charCountMap.put(c, 1);
                }
            }
            return charCountMap;
        } catch (IOException e) {
            return null;
        }
    }

    public static void sentenceToANewLine(String file) {
        Path filePath = Paths.get(file);
        try {
            List<String> lines = Files.readAllLines(filePath);
            StringBuilder sb = new StringBuilder();
            for (String line : lines) {
                sb.append(line).append("\n");
            }
            String[] sentences = sb.toString().split("(?<=[.?!])\\s+");
            for (String sentence : sentences) {
                System.out.println(sentence);
            }
        } catch (IOException e) {
            System.err.println("Unable to read file");
        }
    }
}
