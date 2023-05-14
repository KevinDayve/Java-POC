package DSA;

public class Josephus {
    public static void main(String[] args) {
        System.out.println(Survivor(5, 3));
    }
    static int Survivor(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return (Survivor(n-1, k) + k) % n;
    }
}
