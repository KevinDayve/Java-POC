public class DieHard {
    public static void main(String[] args) {

    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b%a,a);
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }

    static int lcmdeux(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a%i==0 && b%i==0) {
                gcd = i;
            }
        }
        return (a * b) / gcd;
    }
}