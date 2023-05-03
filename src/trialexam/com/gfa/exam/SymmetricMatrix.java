package trialexam.com.gfa.exam;

public class SymmetricMatrix {
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

//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//
//            System.out.println();
//        }

        System.out.println(isSymmetric(matrix, rows, columns));
    }

    public static boolean isSymmetric(int[][] matrix, int row, int col) {

        boolean symmetric = true;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        return symmetric;
    }
}
