import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int [][] arr = new int [aa][bb];
        int [][] arr2 = new int [aa][bb];
        for(int i=0;i<aa;i++) {
            for(int j=0;j<bb;j++) {
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }
        for(int i=0;i<aa;i++) {
            for(int j=0;j<bb;j++) {
                int a = sc.nextInt();
                arr2[i][j] = a;
            }
        }

        for(int i=0;i<aa;i++) {
            for(int j=0;j<bb;j++) {
                if(arr[i][j]==arr2[i][j]) {
                    System.out.printf("%d ", 0);
                } else {
                    System.out.printf("%d ", 1);
                }
            }
            System.out.println();
        }
    }
}