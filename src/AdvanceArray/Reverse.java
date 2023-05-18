package AdvanceArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 30};
        reversed(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reversed(int[] arr) {
        int n = arr.length - 1;
        int start = 0;
        while (start < n) {
            int temp = arr[start];
            arr[start] = arr[n];
            arr[n] = temp;
            start++;
            n--;
        }
    }
}
