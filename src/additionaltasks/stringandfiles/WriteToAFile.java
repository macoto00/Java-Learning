package additionaltasks.stringandfiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteToAFile {
    public static void main(String[] args) throws IOException {
        Path inputFilePath = Paths.get("src/additionaltasks/stringandfiles/inputFile.txt");
        Path outputFilePath = Paths.get("src/additionaltasks/stringandfiles/outputFile.txt");
        longestWord(inputFilePath, outputFilePath);
    }

    public static void longestWord (Path inputFile, Path outputFile) {
        try {
            List<String> input = Files.readAllLines(inputFile);
            List<String> output = Files.readAllLines(outputFile);
            String fileContent = input.toString();
            String longestWord = "";
            int maxLength = 0;
            String[] words = fileContent.split(" ");
            for (String word : words) {
                if (word.length() > maxLength) {
                    maxLength = word.length();
                    longestWord = word;
                }
            }
            String cleanLongestWord = longestWord.replaceAll("[^a-zA-Z0-9]+$", "").replaceAll("^[^a-zA-Z0-9]+", "");
            output.add(cleanLongestWord + ", letters count: " + maxLength);
            Files.write(outputFile, output);
        } catch (IOException e) {
            System.out.println("Error: Can not manipulate file - original error message: <message>");
        }
    }
}


