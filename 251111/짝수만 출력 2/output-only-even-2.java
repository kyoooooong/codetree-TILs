import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        int cnt = b;
        while (cnt>=a) {
            if (cnt %2==0) {
                System.out.printf("%d ", cnt);
            }
            cnt--;
        }
    }
}