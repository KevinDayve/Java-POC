package Arrays;


import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int el1, int el2) {
        int temp = arr[el1];
        arr[el1] = arr[el2];
        arr[el2] = temp;
    }
}
