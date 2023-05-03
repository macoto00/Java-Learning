package additionaltasks.twodarrayssum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatrixAdditionTest {

    @Test
    @DisplayName("Test for same number of rows and columns.")
    void matrixAddition() throws Exception {
        int[][] matrix1 = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
        int[][] matrix2 = {{3, 0, 1}, {0, 2, 2}, {1, 2, 5}};

        int [][] expected = {{4, 0, 2}, {0, 4, 4}, {2, 4, 10}};

        int[][] result = MatrixAddition.matrixAddition(matrix1, matrix2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testMatrixAdditionInvalidInput() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}, {9, 10}};

        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            MatrixAddition.matrixAddition(matrix1, matrix2);
        });

        Assertions.assertEquals("Invalid input", thrown.getMessage());
    }
}