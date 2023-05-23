package AdvanceArray;

import java.util.Arrays;

public class RainWater {
    public static void main(String[] args) {

    }
    static int trapping(int[] arr) {
        if (isSort(arr) || reverseSort(arr)) {
            return 0;
        }
        int result = 0;
        int[] lmax = new int[arr.length];
        int[] rmax = new int[arr.length];

        lmax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }
        rmax[rmax.length-1] = arr[arr.length - 1];
        for (int i = arr.length-2; i >= 0 ; i--) {
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }
        for (int i = 1; i < arr.length; i++) {
            result = result + (Math.min(lmax[i], rmax[i]) - arr[i]);
        }
        return result;
    }
    static boolean isSort(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    static boolean reverseSort(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
