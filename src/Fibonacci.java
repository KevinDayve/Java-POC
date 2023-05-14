public class Fibonacci{
    public static void main(String[] args) {
        System.out.println(Fibo(10));

    }

    static int Fibo(int n){
        // base condition
        if (n<2){
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
}
