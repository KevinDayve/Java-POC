package AdvanceArray;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftrotate(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void leftrotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    // Left rotate by "D"
    static void rotate(int[] arr, int d) {
        int n = arr.length;
        d = d % n;

        int[] temp = new int[d];

        for (int i = n - d, j = 0; i < n; i++, j++) {
            temp[j] = arr[i];
        }
        //Shifting
        for (int i = n-d-1; i >= 0 ; i--) {
            arr[i + d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }
}
