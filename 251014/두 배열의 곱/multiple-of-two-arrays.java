import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];
        int [][] arr2 = new int [3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                int a = sc.nextInt();
                arr2[i][j] = a;
            }
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.printf("%d ", arr[i][j]*arr2[i][j]);
            }
            System.out.println();
        }
    }
}