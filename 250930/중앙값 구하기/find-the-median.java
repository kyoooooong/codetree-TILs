import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a<b && b<c) {
            System.out.print(b);
        } else if (b<a && a<c) {
            System.out.print(a);
        } else {
            System.out.print(c);
        }

    }
}