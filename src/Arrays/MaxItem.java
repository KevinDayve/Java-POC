package Arrays;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int max(int @NotNull [] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int el1, int el2) {
        int temp = arr[el1];
        arr[el1] = arr[el2];
        arr[el2] = temp;
    }

    static int maxRange(int[] arr, int start, int end) {
        int max = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
