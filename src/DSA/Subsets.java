package DSA;

public class Subsets {
    public static void main(String[] args) {
        subsequence("ABC", "", 0);
    }
    static void subsequence(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.print(curr);
            return;
        }
        subsequence(str, curr, i+1);
        subsequence(str, curr+ str.charAt(i), i + 1);
    }
}
