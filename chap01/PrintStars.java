import java.util.Scanner;

public class PrintStars {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);
        int n;
        int w;

        do {
            System.out.print("n : ");
            n = stdIn.nextInt();
            System.out.print("w : ");
            w = stdIn.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n/w; i++){
            System.out.println("*".repeat(w));
        }
        int rest = n % w;
        if (rest != 0){
            System.out.println("*".repeat(rest));
        }
    }
}
