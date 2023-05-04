package fio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a method `ticTacResult` which takes a filename as a parameter,
        // and returns "X", "O" or "Draw" based on the input file's content
        // The file contains a finished Tic-Tac-Toe match
        // See the examples in draw.txt, win-x.txt, win-o.txt

        System.out.println(ticTacResult("src/main/resources/static/win-o.txt"));
        // Should print "O"

        System.out.println(ticTacResult("src/main/resources/static/win-x.txt"));
        // Should print "X"

        System.out.println(ticTacResult("src/main/resources/static/draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String filename) {
        String result = "Draw";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            String[][] board = new String[3][3];

            for (int i = 0; i < 3; i++) {
                board[i] = lines.get(i).split("");
            }

            // Check rows
            for (int i = 0; i < 3; i++) {
                if (board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                    result = board[i][0];
                    break;
                }
            }

            // Check columns
            for (int i = 0; i < 3; i++) {
                if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i])) {
                    result = board[0][i];
                    break;
                }
            }

            // Check diagonals
            if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) {
                result = board[0][0];
            } else if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
                result = board[0][2];
            }

        } catch (IOException e) {
            result = "File not found";
        }
        return result;
    }
}

