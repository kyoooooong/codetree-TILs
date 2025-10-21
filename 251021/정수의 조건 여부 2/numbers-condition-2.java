import java.util.*;

public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==5) {
            System.out.println("A");
        } 
        if(a%2==1) {
            a+=1;
            a/=2;
        } else if (a%2==0) {
            System.out.println("B");
        }
    }
}