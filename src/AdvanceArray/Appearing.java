package AdvanceArray;

public class Appearing {
    public static void main(String[] args) {

    }
    static int MaxAppears(int[] left, int[] right, int n) {
        int[] freq = new int[100];
        for (int i = 0; i < n; i++) {
            for (int j = left[i]; j < right[i]; j++) {
                freq[j] += 1;
            }
        }
        int res = 0;
        for (int i = 1; i < 100; i++) {
            if (freq[i] > freq[res]) {
                res = i;
            }
        }
        return res;
    }
}
