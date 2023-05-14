package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBeginnings {
    public static void main(String[] args) {
        // Array data type should be the same.

        String[] str = {"Kevin", "Viyoni", "Basic", "word",
                "Noway"};
        int[] nums = {3, 4, 5, 12, 15};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[0] = 10;
    }
}
