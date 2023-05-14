package DSA;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        PowerSet(s);

    }
    static void PowerSet(String s) {
        int n = s.length();
        int power = (int)Math.pow(2, n);
        for (int i = 0; i < power; i++) {
            for (int j = 0; j<n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
        }
    }
}
