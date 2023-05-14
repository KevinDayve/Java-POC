package Recursion;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class SortedArray {
    public static void main(String[] args) {
        int[] check = {1,2,3,4,5,6,10,9};
        //System.out.println(sorted(check));
        //System.out.println(recursionsort(check, 0, 1));
        System.out.println(check.length);
        System.out.println(check.length + 1);
        System.out.println(kunalsort(check, 0));
    }

    @Contract(pure = true)
    static boolean sorted(int @NotNull [] arr) {
        for (int i = 0; i <= arr.length; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    @Contract(pure = true)
    static boolean recursionsort(int @NotNull [] arr, int pointer, int subsequent) {
        if (subsequent <= arr.length) {
            return true;
        }
        if (arr[pointer] > arr[subsequent]) {
            return false;
        }
        return recursionsort(arr, pointer+1, subsequent+1);
    }

    static boolean kunalsort (int[] arr, int pointer) {
        if (pointer == arr.length) {
            return true;
        }
        if (arr[pointer] > arr[pointer + 1]) {
            return false;
        }
        return kunalsort(arr, pointer + 1);

    }

    static boolean kunalsort2(int[] arr,int index) {
        //base condition
        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index+1] && kunalsort2(arr, index + 1);
    }

}
