import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if(A>c && B>d) {
            System.out.print("1");
        } else{
            System.out.print("0");
        }

    }
}