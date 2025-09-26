import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = 3000;
        int c = 1000;

        if (a>=b) {
            System.out.println("book");
        } else if (a >=c) {
            System.out.println("mask");
        } else {
            System.out.println("no");
        }
    }
}