import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i=a;i<=100;i++) {
            if (i>=90) {
                System.out.printf("%s ", 'A');

            } else if (i>=80) {
                System.out.printf("%s ", 'B');

            } else if (i>=70) {
                System.out.printf("%s ", 'C');

            } else if (i>=60) {
                System.out.printf("%s ", 'D');
            } else {
                System.out.printf("%s ", 'F');
            }
        }
    }
}