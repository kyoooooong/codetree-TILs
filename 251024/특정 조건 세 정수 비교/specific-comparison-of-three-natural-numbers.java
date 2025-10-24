import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int c = sc.nextInt();

        if(A<B && A<c) {
            System.out.print("1");
        } else{
            System.out.print("0");
        }
        System.out.print(" ");

         if (A == B && B == c)  {
            System.out.print("1");
        } else{
            System.out.print("0");
        }


    }
}