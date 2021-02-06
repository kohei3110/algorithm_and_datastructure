import java.util.Scanner;

public class SumGauss {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Gauss Method");
        System.out.println("n : ");
        int n = stdIn.nextInt();
        int coeff = n/2;

        int sum = (1 + n) * coeff;

        System.out.println("Sum from 1 to n is : " + sum);
    }
}
