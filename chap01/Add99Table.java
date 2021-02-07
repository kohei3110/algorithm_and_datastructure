public class Add99Table {
    public static void main(String... args){
        System.out.print("   |");
        for (int i = 1; i < 10; i ++){
            System.out.printf("%3d", i);
        }
        System.out.print("\n---+---------------------------");
        System.out.println();
        for (int i = 1; i < 10; i ++){
            System.out.printf("%2d |", i);
            for (int j = 1; j < 10; j ++){
                int result = i + j;
                System.out.printf("%3d", result);
            }
            System.out.println();
        }
    }
}
