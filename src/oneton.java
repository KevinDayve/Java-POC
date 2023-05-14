public class oneton {
    public static void main(String[] args) {
        fun3(5);
    }

    static void fun(int n) {
        if (n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

    static void fun2(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun2(n-1);
    }

    static void fun3(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun3(n - 1);
        System.out.println(n);
    }
}
