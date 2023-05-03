package additionaltasks.filemanipulation;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class LicencePlate {
    public static void main(String[] args) {

        // initialize Scanner
        System.out.print("Please enter a lincence plate (2-5 letters): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // if statement for requested length and content
        if (input.length() < 2 || input.length() > 5 || input.equals("[0-9]")) {
            System.out.println("The entered licence plate " + "'" + input + "'" + " is invalid!");
        }

        // set file path
        Path filePath = Paths.get("src/additionaltasks/filemanipulation/example.txt");

        // try - catch block
        try {
            List<String> lines = Files.readAllLines(filePath);

            String[] words = lines.toString().split(" ");
            for (String word : words) {
                if (word.contains(input)) {
                    System.out.print(word + " ");
                }
            }

            for (String word : words) {
                if (word.charAt(0) == input.charAt(0)) {
                    System.out.print(word + " ");
                }
            }
        } catch (IOException ex) {
            System.out.println("File not found");
        }
    }
}
