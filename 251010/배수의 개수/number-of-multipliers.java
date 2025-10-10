import java.util.*;

public class Main {
    public static void main(String[] args) {
        int b = 0;
        int c=0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<10;i++) {
            int a = sc.nextInt();
            
            if(a%3==0) {
                b+=1;
            }
            if(a%5==0) {
                c+=1;
            }
        }

        System.out.printf("%d %d", b,c);
        
    }
}