import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c){
        if (a >= b)
            if (b >= c) return b;
            else if (a <= c) return a;
            else return c;
        else if (a > c) return a;
        else if (b < c) return b;
        else return c;
    }

    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a : "); int a = stdIn.nextInt();
        System.out.println("b : "); int b = stdIn.nextInt();
        System.out.println("c : "); int c = stdIn.nextInt();
        int result = med3(a, b, c);
        System.out.println("Median is " + result + ".");
    }
}
