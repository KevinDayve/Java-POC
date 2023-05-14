package DSA;

public class CountSetBits {
    public static void main(String[] args) {

    }

    static int count(int n) {
        int res = 0;
        while (n > 0) {
            res = res + (n & 1); //Brian-Kerringham Algorithm.
            n = n/2;
        }
        return res;
    }
    //Look-up table solution
}
