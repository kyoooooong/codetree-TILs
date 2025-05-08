import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int total =0;

        for(char c:s.toCharArray()) {

            if(c=='(') {
                total++;
            } else if(c==')') {
                total--;
            }
            if(total <0) {
                System.out.println("No");
                return;
            }
        }
        if(total==0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}