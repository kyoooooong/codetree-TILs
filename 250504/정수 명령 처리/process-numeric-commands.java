import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<n;i++) {
            String c = sc.next();
            if(c.equals("push")) {
                int num = sc.nextInt();
                s.push(num);
            } else if (c.equals("pop")){
                int num = s.pop();
                System.out.println(num);
            }
            else if(c.equals("size")) {
                int num = s.size();
                System.out.println(num);
            } else if (c.equals("empty")) {
                if(s.isEmpty()) {
                    System.out.println(1);
                } else{
                    System.out.println(0);
                }
            }else {
                int num = s.peek();
                System.out.println(num);
            }
        }

       
    }
}