
public class Change {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++){
            if(armstrong(i)){
                System.out.print(i + " ");
            }
        }

    }

    // Print three digit armstrong numbers

    static boolean armstrong(int number){
        int original = number;
        int sum = 0;

        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }


    static boolean isPrime(int n) {
        if (n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c >n;
    }

}
