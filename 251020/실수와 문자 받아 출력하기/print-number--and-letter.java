import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        char n = m.charAt(0);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(n);
        System.out.printf("%.2f\n",a);
        System.out.printf("%.2f",b);
    }
}