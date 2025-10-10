import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = 0;
        for(int i=1;i<=a;i++) {
            if (!(i % 3 == 0 || i % 5 == 0 || i % 2 == 0)) {
                b += 1;
            }
        }
        System.out.println(b);
    }
}