import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue <Integer> q= new LinkedList<>();

        for (int i=1;i<n+1;i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int j=0;j<k-1;j++) {
                if (q.isEmpty()!= true) {
                    int a = q.poll();
                    q.add(a);
                    if(j==k-2) {
                        int b = q.poll();
                        System.out.print(b);
                    }
                } else {
                    break;
                }
            }
            if (q.size()!=0) {
                System.out.print(" ");
            }
        }

        // Please write your code here.
    }
}