import java.util.Scanner;


public class SumForAny {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Sum from a to b");
        System.out.println("a : ");
        int a = stdIn.nextInt();
        System.out.println("b : ");
        int b = stdIn.nextInt();
        int coeff = Math.abs(a-b);
        coeff += 1;
        int sum = ((a + b) * coeff) / 2;
        System.out.println("Sum from a to b is : " + sum);
    }
}
