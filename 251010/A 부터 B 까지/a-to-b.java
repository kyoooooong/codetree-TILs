import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a;
        System.out.print(c+" ");
        while (true) {
            if(c>=b) {
                break;
            }
            if(c%2==1) {
                c*=2;
            } else {
                c+=3;
            }
            System.out.print(c+" ");
        }
    }
}