import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int cnt = 0;

        while (cnt + 3 <= a) {   // 다음 3의 배수가 a 이하일 때만
            cnt += 3;
            System.out.printf("%d ", cnt);
        }
    }
}
