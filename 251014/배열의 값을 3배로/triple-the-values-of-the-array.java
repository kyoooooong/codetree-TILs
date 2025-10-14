import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int [3][3];
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                int a = sc.nextInt();
                arr[i][j] = a*3;
            }
        }

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}