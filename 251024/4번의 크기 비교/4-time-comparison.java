import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.printf("%d\n", (A > B) ? 1 : 0);
        System.out.printf("%d\n", (A > c) ? 1 : 0);
        System.out.printf("%d\n", (A > d) ? 1 : 0);
        System.out.printf("%d\n", (A > e) ? 1 : 0);
    }
}
