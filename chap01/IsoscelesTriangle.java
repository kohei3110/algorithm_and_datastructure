import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String... args){
        int shortEdge;
        do {
            System.out.print("Short Edge : ");
            Scanner stdIn = new Scanner(System.in);
            shortEdge = stdIn.nextInt();
        } while (shortEdge <= 0);

        for (int i = 0; i < shortEdge; i ++) {
            for (int j = 0; j < i+1; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
