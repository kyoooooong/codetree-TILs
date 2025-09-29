import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=a;i<=a*5;i++) {
            if(i%a==0) {
                System.out.print(i+" ");
            }
        }
    }
}