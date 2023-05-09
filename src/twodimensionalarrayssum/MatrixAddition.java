package additionaltasks.twodimensionalarrayssum;
public class MatrixAddition {

    public static int[][] matrixAddition (int[][] matrix1, int[][] matrix2) throws Exception {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (rows1 != rows2 || cols1 != cols2) {
            throw new Exception("Invalid input");
        }
        int[][] result = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}



