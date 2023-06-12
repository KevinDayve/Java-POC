package Searching;

public class BS {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        System.out.println(recursiveSearch(arr, 50, 0, arr.length));
    }
    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (arr[midpoint] == target) {
                return midpoint;
            }
            if (target > arr[midpoint]) {
                start = midpoint + 1;
            } else if (target < arr[midpoint]) {
                end = midpoint - 1;
            }
        }
        return -1;
    }
    static int recursiveSearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start + (end - start) / 2;

        if (arr[middle] == target) {
            return middle;
        }
        if (arr[middle] < target) {
            return recursiveSearch(arr, target, middle + 1, end);
        } else return recursiveSearch(arr, target, start, middle - 1);
    }
}
