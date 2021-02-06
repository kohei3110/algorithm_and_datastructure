import java.util.Scanner;

public class Digits {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("n : ");
        int n = stdIn.nextInt();
        System.out.println("Digits is : " + String.valueOf(n).length());
        
    }
}
