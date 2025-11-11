import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 첫 번째 정수 입력
        int b = sc.nextInt();   // 두 번째 정수 입력

        System.out.printf("%.21f", (double)a / b); // 실수 나눗셈 후 소수점 21자리 출력
    }
}
