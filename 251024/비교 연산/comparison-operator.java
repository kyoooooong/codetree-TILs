import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.printf("%d \n", (A >= B) ? 1 : 0);
        System.out.printf("%d \n", (A > B) ? 1 : 0);
        System.out.printf("%d \n", (B >= A) ? 1 : 0);
        System.out.printf("%d \n", (B > A) ? 1 : 0);
        System.out.printf("%d \n", (A == B) ? 1 : 0);
        System.out.printf("%d \n", (A != B) ? 1 : 0);
    }
}