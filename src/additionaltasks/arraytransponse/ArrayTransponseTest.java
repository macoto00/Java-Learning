package additionaltasks.arraytransponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTransponseTest {
    @Test
    @DisplayName("Test for transponse")
    void transpose() {
        int[][] matrix1 = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}};

        int [][] expected = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}};

        int[][] result = ArrayTransponse.transpose(matrix1);

        assertArrayEquals(expected, result);
    }
    @Test
    public void testMatrixAdditionInvalidInput() {
        int[][] matrix1 = {{1, 2}, {3, 4, 5}, {3, 4}};

        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            ArrayTransponse.transpose(matrix1);
        });

        Assertions.assertEquals("Invalid input", thrown.getMessage());
    }
}