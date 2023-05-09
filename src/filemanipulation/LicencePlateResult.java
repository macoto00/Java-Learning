package additionaltasks.filemanipulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LicencePlateResult {
    public static void main(String[] args) {
        // set file path
        Path filePath = Paths.get("src/additionaltasks/filemanipulation/example.txt");

        Scanner scanner = new Scanner(System.in);
        String licencePlate = null;
        boolean isValid = false;

        // Ask user for input and validate it
        while (!isValid) {
            System.out.println("Please enter a license plate (2-5 letters):");
            licencePlate = scanner.nextLine().toUpperCase();
            if (licencePlate.matches("[A-Z]{2,5}")) {
                isValid = true;
            } else {
                System.out.println("The entered license plate '" + licencePlate + "' is invalid!");
            }
        }

        // Parse and search through the words in the file
        List<String> matchingWords = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(new File(filePath.toUri()));
            while (fileScanner.hasNextLine()) {
                String word = fileScanner.nextLine().toLowerCase();
                if (isMatchingWord(licencePlate, word)) {
                    matchingWords.add(word);
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        // Display results or a message if no matching words found
        if (matchingWords.isEmpty()) {
            System.out.println("No matching words found");
        } else {
            System.out.println(matchingWords);
        }
    }

    private static boolean isMatchingWord(String licencePlate, String word) {
        int lpIndex = 0;
        int wordIndex = 0;
        boolean isFirstLetterMatched = false;

        while (lpIndex < licencePlate.length() && wordIndex < word.length()) {
            char lpChar = licencePlate.charAt(lpIndex);
            char wordChar = word.charAt(wordIndex);

            if (!Character.isLetter(lpChar) || !Character.isLetter(wordChar)) {
                return false;
            }

            if (!isFirstLetterMatched) {
                if (isVowel(lpChar) && isVowel(wordChar)) {
                    isFirstLetterMatched = true;
                } else if (!isVowel(lpChar) && isVowel(wordChar)) {
                    return false;
                } else if (isVowel(lpChar) && !isVowel(wordChar)) {
                    lpIndex++;
                    isFirstLetterMatched = true;
                } else if (lpChar != wordChar) {
                    return false;
                }
            } else {
                if (isVowel(lpChar)) {
                    if (isVowel(wordChar)) {
                        wordIndex++;
                    }
                } else {
                    if (isVowel(wordChar)) {
                        lpIndex++;
                    } else if (lpChar != wordChar) {
                        return false;
                    } else {
                        wordIndex++;
                    }
                }
            }

            lpIndex++;
            wordIndex++;
        }

        return lpIndex == licencePlate.length() && wordIndex == word.length();
    }

    private static boolean isVowel(char c) {
        return "AEIOU".indexOf(c) != -1;
    }
}

