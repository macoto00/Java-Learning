package additionaltasks.arraytransponse;

import java.util.Arrays;

public class ArrayTransponse {
    public static void main(String[] args) {
        int rows = 3;
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

        System.out.println("matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("result: ");
        int[][] matrix2 = transpose(matrix);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix2));
    }
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // handle irregular matrices, i.e. matrices where the length of
        // each row is not the same, by throwing an exception
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    throw new IllegalArgumentException("Invalid input");
                }
            }
        }

        // new matrix where the result is stored
        int[][] result = new int[rows][columns];

        // loop to fill the result with transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[j][i];
            }
        }
        return result;
    }
}
