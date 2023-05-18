package AdvanceArray;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        int[] arr = {1, 12, 8, 5, 6};
        System.out.println(delete(arr, arr.length, 12));
    }
    // Simple linear search.
    static int search(int[] arr, int n, int target) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static int insert(int[] arr, int n, int x, int capacity, int position) {
        if (n == capacity) {
            return n;
        }
        int index = position - 1;
        for (int i = n-1; i < index; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = x;
        return (n+1);
    }
    static int delete(int[] arr, int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
            if (i == n) {
                return n;
            }
            for (int j = i; j < n-1; j++) {
                arr[j] = arr[j+1];
            }
        return (n-1);
    }
}
