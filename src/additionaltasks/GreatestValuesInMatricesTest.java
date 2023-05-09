package additionaltasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class GreatestValuesInMatricesTest {

    @org.junit.jupiter.api.Test
    @DisplayName("Test for the correct output matrix.")
    void mergeMatrix() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] expected = {{9, 8, 7}, {6, 5, 6}, {7, 8, 9}};
        int[][] actual = GreatestValuesInMatrices.mergeMatrix(matrix1, matrix2);
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test for the invalid input.")
    void mergeMatrixInvalidInput() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}, {9, 10}};

        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            GreatestValuesInMatrices.mergeMatrix(matrix1, matrix2);
        });

        Assertions.assertEquals("Invalid input or matrices not the same size", thrown.getMessage());
    }
}