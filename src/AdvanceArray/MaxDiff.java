package AdvanceArray;



public class MaxDiff {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maximum(arr));
    }
    static int maximum(int[] arr) {
        int MaxDiff = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] - arr[i] > MaxDiff) {
                    MaxDiff = arr[j] - arr[i];
                }
            }
        }
        return MaxDiff;
    }
    static int efficient(int[] arr) {
        int res = arr[1] - arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                res = Math.max(res, arr[j] - arr[i]);
            }
        }
        return res;
    }
    static int Difference(int[] arr) {
        int result = arr[1] - arr[0];
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = Math.max(result, arr[i] - minVal);
            minVal = Math.min(minVal, arr[i]);
        }
        return result;
    }
}
