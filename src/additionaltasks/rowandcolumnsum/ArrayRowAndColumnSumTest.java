package additionaltasks.rowandcolumnsum;

import additionaltasks.arraytransponse.ArrayTransponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayRowAndColumnSumTest {

    @Test
    void arrayRowAndColumnSum() throws Exception {
        int[][] matrix1 = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}};

        int [][] expected = {
                {2, 4, 8},
                {2, 4, 8}};

        int[][] result = ArrayRowAndColumnSum.arrayRowAndColumnSum(matrix1);

        assertArrayEquals(expected, result);
    }
    @Test
    public void testEmptyArray() {
        int[][] matrix1 = new int[0][0];
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            ArrayTransponse.transpose(matrix1);
        });
        Assertions.assertEquals("Index 0 out of bounds for length 0", thrown.getMessage());
    }
}