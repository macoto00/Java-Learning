package additionaltasks.matrixofshorterstrings;

import additionaltasks.arraytransponse.ArrayTransponse;
import additionaltasks.rowandcolumnsum.ArrayRowAndColumnSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShorterStringTest {

    @Test
    void shorterStringsMatrix() throws Exception {
        String[][] matrix1 = {
                {"apple", "banana", "orange"},
                {"cat", "dog", "elephant"},
                {"red", "green", "blue"}};

        String[][] matrix2 = {
                {"app", "pear", "grape"},
                {"rabbit", "fox", "lion"},
                {"purple", "pink", "yellow"}};

        String[][] expected = {
                {"app", "pear", "grape"},
                {"cat", "dog", "lion"},
                {"red", "pink", "blue"}};

        String[][] result = ShorterString.shorterStringsMatrix(matrix1, matrix2);

        assertArrayEquals(expected, result);
    }
    @Test
    public void testEmptyArray() {
        String[][] matrix1 = {
                {"apple", "banana", "orange"},
                {"cat", "dog", "elephant"},
                {"red", "green", "blue"}};

        String[][] matrix2 = {
                {"app", "pear"},
                {"rabbit", "fox", "lion"},
                {"purple", "pink", "yellow"}};
        Exception thrown = Assertions.assertThrows(Exception.class, () -> {
            ShorterString.shorterStringsMatrix(matrix1, matrix2);
        });
        Assertions.assertEquals("Invalid input", thrown.getMessage());
    }
}