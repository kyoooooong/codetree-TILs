import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = (10000*b)/(a*a);
        System.out.println(d);
        if(d>=25) {
            System.out.println("Obesity");
        }
    }
}