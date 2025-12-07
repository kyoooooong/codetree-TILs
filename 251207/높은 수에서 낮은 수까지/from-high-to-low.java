import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // ✅ char 타입으로 수정
        int b = sc.nextInt();

        if (b>=a) {
            for(int i=b;i>=a;i--) {
                System.out.printf("%d ", i);
            }
        } else {
            for(int i=a;i>=b;i--) {
                System.out.printf("%d ", i);
            }
        }
    }
}