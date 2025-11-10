import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int mid;

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            mid = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            mid = b;
        } else {
            mid = c;
        }

        System.out.print(mid);
    }
}
