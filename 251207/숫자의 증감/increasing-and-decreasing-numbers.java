import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);   // 첫 번째 정수 입력
        int b = sc.nextInt();   // 두 번째 정수 입력

        if (a=='A') {
            for(int i=1;i<=b;i++) {
                System.out.printf("%d ",i);
            }

        } else {
            for(int i=b;i>=1;i--) {
                System.out.printf("%d ",i);
            }
        }
    }
}