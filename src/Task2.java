public class Task2 {
    public static boolean isSingular(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            return false;
        }

        int n = matrix.length;
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            mat[i] = matrix[i].clone();
        }

        double determinant = calculateDeterminant(mat);
        return determinant == 0;
    }

    public static int calculateDeterminant(int[][] matrix) {
        int x = (matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]));
        int y = (matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]));
        int z = (matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]));

        return x - y + z;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {3, 3, 3},
            {7, 7, 2}
        };

        System.out.println(isSingular(matrix1));
        System.out.println(isSingular(matrix2));
    }
}
