import java.util.Scanner;

public class SumForAny2 {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);

        int n;

        do {
            System.out.println(" n : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.println("Sum from 1 to n is : " + sum);
    }
}
