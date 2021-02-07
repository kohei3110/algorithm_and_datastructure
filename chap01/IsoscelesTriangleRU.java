import java.util.Scanner;

public class IsoscelesTriangleRU {
    public static void main(String... args){
        int shortEdge;
        do{
            System.out.print("Short Edge : ");
            Scanner stdIn = new Scanner(System.in);
            shortEdge = stdIn.nextInt();
        } while (shortEdge <= 0);

        for (int i = 1; i <= shortEdge; i ++){
            for (int j = 1; j <= i-1; j ++){
                System.out.print(" ");
            }
            for (int j = 1; j <= shortEdge-i+1; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
