public class SquareRoot {
    public static void main(String[] args) {
        int n = 35;
        int precision = 3;

        System.out.println(sqrt(n, precision));
    }

    static double sqrt(int n, int p) {
        int start = 0;
        int end = n;
        double root = 0.0;

        while (start <= end) {
            int mid = start + (start - end) / 2;

            if (mid * mid == n) {
                root = mid;
                return root;
            }

            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += increment;
            }

            root -= increment;
            increment /= 10;
        }


        return root;
    }
}
