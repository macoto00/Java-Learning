package foundationexam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class MostProductiveYear {
    // unfinished code which should return the most productive year for the film studio
    public static int mostProductiveYear(String string) {
        if (string == null) {
            throw new IllegalArgumentException("The provided String is null");
        }

        Path filePath = Paths.get(string);
        StringBuilder sb = new StringBuilder();
        int mostProductiveYear = 0;

        try {
            List<String> providedFile = Files.readAllLines(filePath);

            for (String line : providedFile) {
                sb.append(line).append("\n");
            }
            sb = new StringBuilder(sb.toString().replaceAll("[^0-9]+", " "));

            System.out.println(Arrays.asList(sb.toString().trim().split(" ")));
            System.out.println(sb);

        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
        return mostProductiveYear;
    }
}
