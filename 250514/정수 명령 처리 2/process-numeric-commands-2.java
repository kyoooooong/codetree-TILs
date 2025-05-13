import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i =0;i<n;i++) {
            String s = sc.next();
            if (s.equals("push")) {
                int a = sc.nextInt();
                q.add(a);
            } else if (s.equals("pop")) {
                int a = q.poll();
                System.out.println(a);

            }else if (s.equals("size")) {
                System.out.println(q.size());

            } else if (s.equals("empty")) {
                if (q.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }

            } else if (s.equals("front")) {
                System.out.println(q.peek());

            }
        }

        // Please write your code here.
    }
}