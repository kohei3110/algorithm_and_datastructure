import java.util.Scanner;

public class IsoscelesTriangleRB {
    public static void main(String... args){
        int n;

        do {
            System.out.print("Short Edge : ");
            Scanner stdIn = new Scanner(System.in);
            n = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
