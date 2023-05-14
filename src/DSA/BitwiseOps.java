package DSA;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BitwiseOps {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
        int[] arr = {2, 3, 4, 6, 2, 3, 4};
        System.out.println(ans(arr));
    }
    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
    // O(n) complexity solution
    @Contract(pure = true)
    static int ans(int @NotNull [] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
    static int kthbit(int n) {
        return n & (1 << (n-1));
    }
}