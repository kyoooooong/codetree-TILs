import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        for(int i=0;i<a;i++) {
            for( int j=0;j<=i;j++) {
                b++;
                System.out.printf("%d ",b);
            }
            System.out.println();
        }
    }
}