import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=0;
        int c=0;

        for(int i=1;i<=100;i++) {
            if(b>=a) {
                break;
            }
            b+=i;
            c=i;
        }
        System.out.print(c);
    }
}