public class Numbers {
    public static void main(String[] args) {
        //print first five numbers
        publish(1);
    }

    static void publish(int n){
        if (n > 5){
            return;
        }
        System.out.println(n);
        publish(n+1);
        System.out.println(n);
    }
}

