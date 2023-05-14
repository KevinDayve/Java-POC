public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(121));
    }

    static boolean palin(int n){
        String number = Integer.toString(n);
        return helper(number, 0, number.length() - 1);
    }

    private static boolean helper(String number, int start, int end){
        if (start >= end){
            return true;
        }
        return (number.charAt(start) == number.charAt(end)) && helper(number,start+1, end-1);
    }
}
