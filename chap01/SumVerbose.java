import java.util.Scanner;

public class SumVerbose {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        int result = 0;

        do {
            System.out.print("n : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i ++) {
            result += i;
            if (i < n) System.out.print(i + " + ");
            else System.out.print(i + " = ");            
        }
        System.out.println(result);

    }
}
