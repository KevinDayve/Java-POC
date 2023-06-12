package AdvanceArray;

public class SubArray {
    public static void main(String[] args) {

    }
    static boolean ExistsOrNot(int[] arr, int sum) {
        int value = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                value += arr[j];
                if (value == sum) {
                    return true;
                }
            }
        }
        return false;
    }
    static boolean Efficient(int[] arr, int sum) {
        int start = 0;
        int current = 0;
        for (int e = 0; e < arr.length; e++) {
            current += arr[e];
            while (sum < current) {
                current -= arr[start];
                start++;
            }
            if (current == sum) return true;
        }
        return false;
    }
}
