import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        char[] arr = new char[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++) {
            char a = sc.next().charAt(0);
            arr[i] = a;
        }

        for(int i=9;i>=0;i--) {
            System.out.print(arr[i]);
        }
    }
}