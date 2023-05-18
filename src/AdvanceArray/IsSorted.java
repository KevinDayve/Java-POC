package AdvanceArray;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 299};
        System.out.println(isSort(arr));
    }
    static boolean isSort(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
