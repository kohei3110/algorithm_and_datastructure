import java.util.Scanner;

public class TwoDigits {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);
        int no;

        do {
            System.out.print("no : ");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99);

        System.out.println("no is : " + no);
    }
}
