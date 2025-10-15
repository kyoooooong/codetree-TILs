import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        int[] arr = new int[aa];

        for (int i = 0; i < aa; i++) {
            arr[i] = i + 1; // 1부터 n까지 저장
        }

        for (int i = 0; i < aa; i++) {
            if (i % 2 == 0) { // 짝수 줄: 정방향
                for (int j = 0; j < aa; j++) {
                    System.out.print(arr[j]);
                }
            } else { // 홀수 줄: 역방향
                for (int j = aa - 1; j >= 0; j--) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println(); // 각 블록 사이 공백
        }
    }
}