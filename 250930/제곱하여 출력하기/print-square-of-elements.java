
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        // 배열 값 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // 제곱 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * arr[i] + " ");
        }
    }
}