import java.util.Scanner;

public class Digits2 {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);
        
        int n;

        do {
            System.out.println("n : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        int result = 1;
        for(int i = 0; i < n/10; i++){
            result += 1;
        }

        System.out.println("Digit is : " + result);
        
    }
}
