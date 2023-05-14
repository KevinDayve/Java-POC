package DSA;

import org.jetbrains.annotations.NotNull;

public class OddOccurring {
    public static void main(String[] args) {
        int[] arr = {4, 4, 7, 4, 8, 7, 7, 7, 8};
        int[] arr2 = {4,4,4,5,5,5,6,6,8,8,9,9,9,9};
        System.out.println(findOdd(arr, arr.length));
        twoOdd(arr2, arr2.length);
    }
    //Function to check which number appears odd # times.
    //in an array where the rest of the numbers are even.
    static int findOdd(int @NotNull [] arr, int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }
    //Find numbers which are odd and occur twice!
    static void twoOdd(int @NotNull [] arr, int n) {
        int x = arr[0];
        for (int i = 1; i < n; i++) {
            x = x ^ arr[i];
        }
        int k = (x & (~(x-1)));
        int res1 = 0; int res2 = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & k) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
    }
}
