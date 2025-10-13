import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.printf("%d * %d = %d", i, j, i * j);
                if (j != a) { // 같은 행 안에서 마지막 항이 아닐 때만 쉼표
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
        }
    }
}