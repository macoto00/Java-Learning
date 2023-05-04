package fio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method called `decryptEncoded` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the encoded-lines.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        decryptEncoded("src/main/resources/static/encoded-lines.txt");
    }

    public static void decryptEncoded(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            StringBuilder decryptedContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                decryptedContent.append(decrypt(line)).append("\n");
            }
            writer.write(decryptedContent.toString());
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    private static String decrypt(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < encrypted.length(); i++) {
            char c = encrypted.charAt(i);
            if (Character.isLetter(c)) {
                decrypted.append((char) (c - 1));
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}
