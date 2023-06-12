package AdvanceArray;

public class MatrixValue {
    public static void main(String[] args) {

    }
    static int OddCells(int m, int n, int[][] index) {
        int count = 0;
        int[] row = new int[n];
        int[] col = new int[m];

        for(int[] x : index) {
            row[x[0]]++;
            col[x[1]]++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((row[i] + col[j]) %2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
