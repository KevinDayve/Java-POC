package DSA;

public class Hanoi {
    public static void main(String[] args) {
        int n = 2;
        Tower(n, 'A', 'B', 'C');
    }
    static void Tower(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Moved Disc (n == 1) from" + A + " to " + C);
            return;
        }
        Tower(n-1, A, C, B);
        System.out.println("Moved "+ n + "From" + A + "to" + C);
        Tower(n-1, B, A, C);
    }
    static long toh(int N, int from, int to, int aux) {
        if (N == 0) {
            return (long)Math.pow(2, N)-1;
        }
        toh(N-1, from, aux, to);
        System.out.println("move disk "+ N + " from rod " +from+ " to rod "+ to);
        toh(N-1, aux, to, from);
        return (long)Math.pow(2, N)-1;
    }
}
//if (N == 0) {
//            return (long)Math.pow(2, N)-1;
//        }
//        toh(N-1, from, aux, to);
//        System.out.println("move disk "+ N + " from rod " +from+ " to rod "+ to);
//        toh(N-1, aux, to, from);
//        return (long)Math.pow(2, N)-1;