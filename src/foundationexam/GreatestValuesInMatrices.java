package foundationexam;

public class GreatestValuesInMatrices {
    public static int[][] mergeMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null || matrix1.length != matrix2.length || !isSquare(matrix1) || !isSquare(matrix2)) {
            throw new IllegalArgumentException("Invalid input or matrices not the same size");
        }

        int size = matrix1.length;
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = Math.max(matrix1[i][j], matrix2[i][j]);
            }
        }

        return result;
    }

    private static boolean isSquare(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            if (matrix[i].length != size) {
                return false;
            }
        }
        return true;
    }

}
