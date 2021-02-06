import java.util.Scanner;

class SumWhile {
    public static void main(String... args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Sum from 1 to n");
        System.out.println("n : ");
        int n = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum from 1 to n is : " + sum);
        System.out.println("i is : " + i + "( = n + 1)");
    }
}