import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];
        int num;
        int total = 0;

        // 첫 번째 배열 입력
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                num= sc.nextInt();
                if (num%5==0) {
                    total ++;
                }
            }
        }
        System.out.println(total);
    }
}