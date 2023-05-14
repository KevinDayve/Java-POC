/*
The reason why fun(n--)
 gives an error is because of how the function call stack works in recursion.
 In the current implementation of fun, the base case is n == 0, which means that the function will stop calling itself recursively when n becomes 0.
 However, if you pass n-- as an argument, the value of n will not be decremented until after the function call is made.
 This means that the base case will never be reached because the value of n will not become 0, and the function will continue to call itself recursively infinitely.
 This will eventually cause a StackOverflowError.
*/

public class Concept {
    public static void main(String[] args) {
    }

    static void fun(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(--n);
    }


}
