package AdvanceArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(arr));
    }
    static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n-i-1];
        }
        if (n % 2 == 1) {
            int m = n / 2;
            sum -= matrix[m][m];
        }
        return sum;
    }
}
