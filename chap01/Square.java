import java.util.Scanner;

public class Square {
    public static void main(String... args){
        int edge;

        do {
            Scanner stdIn = new Scanner(System.in);
            System.out.print("Edge : ");
            edge = stdIn.nextInt();
        } while (edge <= 0);
    
        for (int i = 1; i < edge+1; i++){
            System.out.print("*".repeat(edge));
            System.out.println();
        }    
    }
}
