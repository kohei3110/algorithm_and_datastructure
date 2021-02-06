import java.util.Scanner;

public class JudgeSign {

    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("Input : ");
        int a = stdIn.nextInt();

        if (a > 0) System.out.println("Positive");
        else if (a < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
