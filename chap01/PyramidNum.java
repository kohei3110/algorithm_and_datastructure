import java.util.Scanner;

public class PyramidNum {
    public static void main(String... args){
        int n;
        do {
            System.out.print("n : ");
            Scanner stdIn = new Scanner(System.in);
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i%10);
            }
            for (int j = 1; j <= i-1; j++){
                System.out.print(i%10);
            }
            for (int j = 1; j <= n-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
}
