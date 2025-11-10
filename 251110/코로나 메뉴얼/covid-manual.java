import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt =0;
        for (int i=0;i<3;i++) {
            char a = sc.next().charAt(0);
        int b = sc.nextInt();

        if (a=="Y"){
            if(b>=37) {
                System.out.print("");
                cnt ++;
            } else {
                System.out.print("");
            }
        } else  {

                if(b>=37) {
                System.out.print("");
            } else {
                System.out.print("");
            }
            
        }
        if(cnt>=2) {
                System.out.print("E");
                break;
            } 
        }
        System.out.print("N");
        
    }
}