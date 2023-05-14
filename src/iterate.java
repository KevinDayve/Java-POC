public class iterate {
    public static void main(String[] args) {
        // write a function that prints a simple message
        message(5);
    }

    static void message(int n){
        if (n == 0){
            return;
        }
        System.out.println("A message");
        message(n-1);
    }
}
