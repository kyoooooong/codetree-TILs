import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 3000;
        int m = 1000;
        int a = sc.nextInt();
        if(a>=b) {
            System.out.println("book");
        } else if (a>=m) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}