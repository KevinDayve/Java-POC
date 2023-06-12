package AdvanceArray;

public class CircularSubArr {
    public static void main(String[] args) {
        int[] arr = {8, 3, -5, 6, 1, 12, -5};
        System.out.println(OverallMax(arr));
    }
    static int CircularSum(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr_max = arr[0];
            int curr_sum = arr[0];
            for (int j = 1; j < arr.length; j++) {
                int index = (i + j) % arr.length;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }
    static int normalMaxSum(int[] arr) {
        int res = arr[0];
        int maxE = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxE = Math.max(arr[i], maxE + arr[i]);
            res = Math.max(res, maxE);
        }
        return res;
    }
    static int OverallMax(int[] arr) {
        int max_normal = normalMaxSum(arr);
        if (max_normal < 0) {
            return max_normal;
        }
        int arr_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr_sum += arr[i];
            arr[i] = -arr[i];
        }
        int max_circular = arr_sum + normalMaxSum(arr);
        return Math.max(max_normal, max_circular);
    }
}
