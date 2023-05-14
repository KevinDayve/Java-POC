package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5,7,10};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, target, 0, list));
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAll(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == arr[target]) {
            list.add(index);
        }
        findAll(arr, target, index+1);
    }

    static boolean linearecursion (int[] arr, int target, int pointer) {
        // base condition
        if (pointer == arr.length) {
            return false;
        }

        return arr[pointer] == arr[target] || linearecursion(arr, target, pointer + 1);
    }

    static int findIndex (int[] arr, int target, int pointer) {
        if (pointer == arr.length) {
            return -1;
        }
        if (arr[pointer] == target) {
            return pointer;
        }
        else {
            return findIndex(arr, target, pointer + 1);
        }
    }

    static ArrayList findAllIndex(int[] arr, int target, int pointer, ArrayList<Integer> list) {
        if (pointer == arr.length) {
            return list;
        }
        if (arr[pointer] == target) {
            list.add(pointer);
        }
        return findAllIndex(arr, target, pointer+1, list);
    }

    static ArrayList tricky(int[] arr, int target, int pointer) {
        ArrayList<Integer> list = new ArrayList<>();
        if (pointer == arr.length) {
            return list;
        }

        // this will contain answer to that function call only
        if (arr[pointer] == target) {
            list.add(pointer);
        }

        ArrayList<Integer> ansBelow = tricky(arr, target, pointer+1);

        list.addAll(ansBelow);
        return list;
    }
}