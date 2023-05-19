package AdvanceArray;


import java.util.Arrays;

public class Zeros {
    public static void main(String[] args) {
        int[] arr = {10, 0, 8, 12, 0};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rearrange(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }
    }
}
