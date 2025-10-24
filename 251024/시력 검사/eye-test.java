import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        if(A>=1.0 && B>=1.0) {
            System.out.print("High");
        } else if (A>=0.5 && B>=0.5){
            System.out.print("Middle");
        } else {
            System.out.print("Low");
        }

    }
}