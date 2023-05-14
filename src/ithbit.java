public class ithbit {
    //Extracts the ith bit from the integer n
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nbit(n));
    }
    private static int nbit(int n){
        return (n & (1 << (n-1)));
    }
}
