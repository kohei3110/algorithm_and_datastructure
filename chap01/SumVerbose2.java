import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);
        int n;
        int result = 0;

        do {
            System.out.print("n : ");
            n = stdIn.nextInt();    
        } while (n <= 0);

        if (n == 1) System.out.print(1);
        else {
            for (int i = 1; i < n; i ++){
                result += i;
                System.out.print(i + " + ");
            }
    
            System.out.println(n + " = " + result);
        }
    }
}
