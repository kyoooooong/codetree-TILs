import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = 0;

        while (c<b) {
            c++;
            if (c%b==0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}