public class NoOfDigits {
    public static void main(String[] args) {
        int n = 6;
        int b = 2;


        int ans = (int) (Math.log(n) / Math.log(b)) + 1;

        //System.out.println(ans);
        int x = 31;
        boolean answer = (x & (x-1)) == 0;
        System.out.println(answer);
    }
}
