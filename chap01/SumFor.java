import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class SumFor {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Sum from 1 to n");
        System.out.println("n : ");
        int n = stdIn.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum from 1 to n is : " + sum);
        
    }
}
