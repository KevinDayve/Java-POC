package AdvanceArray;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {

    }
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                    idx = j;
                }
            }
            boolean flag = true;
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][min] > matrix[min][min]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                lucky.add(matrix[min][min]);
            }
        }
        return lucky;
    }
}
