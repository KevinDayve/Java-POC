package AdvanceArray;

public class MaxSubArray {
    public static void main(String[] args) {

    }
    static int FindMax(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                curr = curr + arr[j];
                result = Math.max(result, curr);
            }
        }
        return result;
    }
    static int EffFindMax(int[] arr) {
        int res = arr[0];
        int MaxE = arr[0];
        for (int i = 0; i < arr.length; i++) {
            MaxE = Math.max(MaxE + arr[i], arr[i]);
            res = Math.max(res, MaxE);
        }
        return res;
    }
}