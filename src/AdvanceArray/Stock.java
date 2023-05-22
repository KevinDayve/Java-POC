package AdvanceArray;

public class Stock {
    public static void main(String[] args) {
        int[] arr = {30, 20, 10};
        System.out.println(isDecreasing(arr));
    }
    static int BuyOrSell(int[] arr, int start, int end) {
        if (end <= start) {
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i+1; j <= end; j++) {
                if (arr[j] > arr[i]) {
                    int current = arr[j] - arr[i] +
                            BuyOrSell(arr, start, i-1) +
                            BuyOrSell(arr, j+1, end);
                    profit = Math.max(profit, current);
                }
            }
        }
        return profit;
    }
    static boolean isDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] < arr[i]) {
                return false;
            }
        }
        return true;
    }
}
