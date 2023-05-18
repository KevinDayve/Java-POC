package AdvanceArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 30};
        int[] res = removeDuplicate(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(remDups(arr, arr.length));
    }
    static int[] removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int num: arr) {
            if (set.add(num)) {
                result.add(num);
            }
        }
        int[] unique = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            unique[i] = result.get(i);
        }
        return unique;
    }
    static int remDups(int[] arr, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            if (arr[result-1] != arr[i]) {
                arr[result] = arr[i];
                result++;
            }
        }
        return result;
    }
}
