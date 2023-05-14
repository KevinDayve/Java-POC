package DSA;

public class Optimprime {
    public static void main(String[] args) {
      //  boolean isprime = prime(2);
      //  System.out.println(isprime);
        primefactors(84);
    }
    static boolean prime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 | n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i < Math.sqrt(n); i = i + 6) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primefactors(int n)
    {
        if(n <= 1)
            return;

        while(n % 2 == 0)
        {
            System.out.print(2+" ");

            n = n / 2;
        }

        while(n % 3 == 0)
        {
            System.out.print(3+" ");

            n = n / 3;
        }

        for(int i=5; i*i<=n; i=i+6)
        {
            while(n % i == 0)
            {
                System.out.print(i+" ");

                n = n / i;
            }

            while(n % (i + 2) == 0)
            {
                System.out.print((i + 2)+" ");

                n = n / (i + 2);
            }
        }

        if(n > 3)
            System.out.print(n+" ");

        System.out.println();
    }
}
