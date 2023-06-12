package AdvanceArray;

public class SlidingWindow {
    public static void main(String[] args) {

    }
    // Find max sum of k consecutive elements
    static int findSum(int[] arr, int k) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i + k - 1 < arr.length; i++) {
            int current = 0;
            for (int j = 0; j < k; j++) {
                current += arr[i + j];
            }
            res = Math.max(res, current);
        }
        return res;
    }
    static int Window(int[] arr, int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += arr[i];
        }
        int res = curr;
        for (int i = k; i < arr.length; i++) {
            curr = curr + arr[i] - arr[i-k];
            res = Math.max(res, curr);
        }
        return res;
    }
}
