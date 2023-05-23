package AdvanceArray;

public class Consecutive {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1};
        System.out.println(EffCount(arr));
    }
    static int countOne(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 1) current++;
                else break;
            }
            count = Math.max(count, current);
        }
        return count;
    }
    static int EffCount(int[] arr) {
        int res = 0;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                curr = 0;
            } else if (arr[i] == 1) {
                curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}

