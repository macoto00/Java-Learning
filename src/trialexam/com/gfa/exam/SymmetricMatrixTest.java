package trialexam.com.gfa.exam;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricMatrixTest {

    @Test
    @DisplayName("Test if the matrix is not square because it has more columns.")
    void isSymmetricWithMoreColumns() {
        int rows = 3;
        int columns = 4;
        int min = 0;
        int max = 5;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random_int;
                random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
        }
        boolean expected = false;
        assertEquals(expected, SymmetricMatrix.isSymmetric(matrix, 3,4));
    }
    @Test
    @DisplayName("Test if the matrix is not square because it has more rows.")
    void isSymmetricWithMoreRows() {
        int rows = 4;
        int columns = 3;
        int min = 0;
        int max = 5;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random_int;
                random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            }
        }
        boolean expected = false;
        assertEquals(expected, SymmetricMatrix.isSymmetric(matrix, 3,4));
    }
}