public class Setbits {
    public static void main(String[] args) {
        int n = 45;
        int ans = 0;
        System.out.println(Integer.toBinaryString(n));
        while (n > 0){
            if ((n & 1)== 1){
                ans++;
            }
            n = n >> 1;
        }
        System.out.println("The set bit in n are: " + ans);
    }
}
