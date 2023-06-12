package AdvanceArray;

public class EvenOdd {
    public static void main(String[] args) {

    }
    static int longestSub(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            int current = 1;
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j-1] % 2 != 0) || arr[j] % 2 != 0 && arr[j-1] % 2 == 0) {
                    current ++;
                } else break;
            }
            count = Math.max(count, current);
        }
        return count;
    }
    static int EffLongestSub(int[] arr) {
        int res = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || arr[i] % 2 != 0 && arr[i-1] % 2 == 0) {
                curr ++;
                res = Math.max(res, curr);
            } else curr = 1;
        }
        return res;
    }
}