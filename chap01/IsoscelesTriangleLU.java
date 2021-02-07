import java.util.Scanner;

public class IsoscelesTriangleLU {
    public static void main(String... args){
        int shortEdge;
        do {
            System.out.print("Short Edge : ");
            Scanner stdIn = new Scanner(System.in);
            shortEdge = stdIn.nextInt();
        } while (shortEdge <= 0);
        for (int i = shortEdge; i > 0; i --){
            for (int j = i; j > 0; j --){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
