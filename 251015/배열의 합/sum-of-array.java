import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int num;

        // 첫 번째 배열 입력
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                num= sc.nextInt();
                total += num;
            }
            System.out.println(total);
        }
    }
}