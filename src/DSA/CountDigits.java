package DSA;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        //System.out.println(count(x));
        boolean answer = isPalindrome(x);
        System.out.println(answer);
        System.out.println(count(x));
    }
    static int count(int x) {
        int res = 0;
        while (x > 0) {
            x = x / 10;
            res ++;
        }
        return res;
    }

    static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        }
        String str = Integer.toString(n);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int digit = Character.getNumericValue(str.charAt(i));
            list.add(digit);
        }
        int start = list.get(0);
        int end = list.size() - 1;
        while (start <= end) {
            if (Objects.equals(list.get(start), list.get(end))) {
                start ++;
                end --;
            } else {
                return false;
            }
        }
        return true;
    }
    static boolean palindrome(int n) {
        int reverse = 0;
        int temp = n;

        while (temp != 0) {
            int ld = temp % 10;
            reverse = reverse * 10 + ld;
            temp = temp / 10;
        }

        return reverse == n;
    }
}
