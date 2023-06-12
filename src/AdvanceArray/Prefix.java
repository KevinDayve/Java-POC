package AdvanceArray;

public class Prefix {
    public static void main(String[] args) {
        int[] p = {2, 8, 3, 9, 6, 5, 4};
        int[] sum = new int[p.length];
        sum[0] = p[0];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i-1] + p[i];
        }
        System.out.println(PreSum(sum, 2, 4));
    }
    static int PreSum(int[] arr, int start, int end) {
        if (start == 0) {
            return arr[end];
        }
        return arr[end] - arr[start];
    }
}
