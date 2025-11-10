import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        if (b>=90) {
            if(a>=95 && a<=100) {
            System.out.print("10");
        } else if(a>=90) {
            System.out.print("5");
        } else {
            System.out.print("0");
        }

        } else {
            System.out.print("0");
    }
}}