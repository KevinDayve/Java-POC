import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greeting();
        int sum = sum2(10, 20);
        System.out.println(sum);

    }

    static void greeting(){
        System.out.println("Hey there!");
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        return num1 + num2;
    }

    static int sum2(int a, int b){
        return a + b;

    }
}