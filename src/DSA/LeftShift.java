package DSA;

public class LeftShift {
    public static void main(String[] args) {
        int a = 1 << 9;
        System.out.println(a);
    }

    static void xor(int n) {
        int rem = n % 4;
        if (rem == 0) {
            System.out.print("XOR of N is: " + n);
        }
        if (rem == 1) {
            System.out.print("XOR of N is 1");
        }
        if (rem == 2) {
            System.out.print("XOR of N is: " + n+1);
        }
        if (rem == 3) {
            System.out.print("XOR of N is 0");
        }
    }
}
