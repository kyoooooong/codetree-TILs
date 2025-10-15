import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            if ((j + 1) % 2 == 1) { // 홀수열: 위 → 아래
                for (int i = 0; i < n; i++) {
                    arr[i][j] = i + 1;
                }
            } else { // 짝수열: 아래 → 위
                for (int i = 0; i < n; i++) {
                    arr[n - 1 - i][j] = i + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println(); // 행마다 줄바꿈
        }
    }
}