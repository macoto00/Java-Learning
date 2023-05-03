package additionaltasks.matrixofshorterstrings;

public class ShorterString {
    public static String[][] shorterStringsMatrix (String[][] matrix1, String[][] matrix2) throws Exception {
        int row1 = matrix1.length;
        int column1 = matrix1[0].length;
        int row2 = matrix2.length;
        int column2 = matrix2[0].length;

        if (row1 != row2 || column1 != column2) {
            throw new Exception("Invalid input");
        }

        // Create a new matrix to store the result
        String[][] result = new String[row1][column1];

        // Compare strings in the two matrices and store the shorter one in the result matrix
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                if (matrix1[i][j].length() == matrix2[i][j].length()) {
                    result[i][j] = matrix1[i][j];
                } else if (matrix1[i][j].length() < matrix2[i][j].length()) {
                    result[i][j] = matrix1[i][j];
                } else {
                    result[i][j] = matrix2[i][j];
                }
            }
        }
        return result;
    }
}
