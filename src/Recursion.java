public class Recursion {
    public static void main(String[] args) {
        int ans = Fibo(7);
        System.out.println(ans);

    }

    static int Fibo(int n){
        if (n < 2) {
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
