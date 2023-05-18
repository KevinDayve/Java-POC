package DSA;

public class Article {
    public static void main(String[] args) {
        Hanoi(2, 'K', 'E', 'V');
    }

    //In recursion there is always a base case to avoid
    //stack overflow error.
    //The idea is to breakdown problems into smaller problems and
    //have base case be called when we want to stop the recursion.
    //Disadvantage of recursion is that it has greater space requirements
    //than its iterative counterpart.

    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    static void printfunction(int test) {
        if (test < 1) {
            return;
        }
        System.out.println(test);
        printfunction(test-1);
        System.out.println(test);
        return;
    }
    static void NtoOne(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        NtoOne(n-1);
    }
    static void OneToN(int n) {
        if (n < 1) {
            return;
        }
        OneToN(n-1);
        System.out.println(n);
    }

    //Tail recursion: If the function invokes itself at the end
    //of the function. That if all the statments are executed before the function
    //calls itself.
    static int tailfactorial(int n, int a) {
        if (n == 0) {
            return a;
        }
        return tailfactorial(n-1, n*a);
    }
    static int naturalsum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + naturalsum(n-1);
    }
    static boolean PalindromeHelper(String s, int start, int end) {
        if (start == end) {
            return true;
        }
        if ((s.charAt(start)) != (s.charAt(end))) {
            return false;
        }
        if (start < end + 1) {
            return PalindromeHelper(s, start+1, end-1);
        }
        return true;
    }
    static boolean isPal(String str) {
        int len = str.length();
        if (len == 0) {
            return true;
        }
        return PalindromeHelper(str, 0, len-1);
    }
    static int sumofdigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n%10 + sumofdigits(n/10);
    }
    static int CutTheRope(int rope, int a, int b, int c) {
        if (rope == 0) {
            return 0;
        }
        if (rope < 0) {
            return -1;
        }
        int result = Math.max(CutTheRope(rope-a, a, b, c),
                Math.max(CutTheRope(rope-b, a, b, c),
                        CutTheRope(rope-c, a, b, c)));

        if (result < 0) {
            return -1;
        }
        return result + 1;
    }
    static void generate(String str, int index, String curr) {
        int len = str.length();
        //base case
        if (index == len) {
            System.out.println(curr);
            return;
        }
        generate(str, index + 1, curr + str.charAt(index));
        generate(str, index + 1, curr);
    }
    static void Hanoi(int n, char from, char to, char aux) {
        if (n == 0) {
            return;
        }
        Hanoi(n-1, from, aux, to);
        System.out.println("Moved disc " + n + " from rod " +
                from +  " to rod " + to);
        Hanoi(n-1, aux, to, from);
    }
    static int Josephus(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (Josephus(n-1, k) + k + 1) % n + 1;
    }
    static void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(" ");
        }
        for (int i = left; i <= right; i++) {
            str = swap(str, left, i);
            permute(str, left+1, right);
            str = swap(str, left, i);
        }
    }
    static String swap(String a, int i, int j) {
        char temp;
        char[] charArr = a.toCharArray();
        temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
        return String.valueOf(charArr);
    }
}
