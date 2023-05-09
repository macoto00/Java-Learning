package additionaltasks.rowandcolumnsum;

public class ArrayRowAndColumnSum {
    public static int[][] arrayRowAndColumnSum (int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] result = new int[2][column];

        if (column == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }

        // Calculate row sums
        for (int i = 0; i < row; i++) {
            int rowSum = 0;
            for (int j = 0; j < column; j++) {
                rowSum += matrix[i][j];
            }
            result[0][i] = rowSum;
        }

        // Calculate column sums
        for (int j = 0; j < column; j++) {
            int colSum = 0;
            for (int i = 0; i < row; i++) {
                colSum += matrix[i][j];
            }
            result[1][j] = colSum;
        }

        return result;
    }
}
