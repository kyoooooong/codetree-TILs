import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String[] arr = m.split(":");
        System.out.printf("%d:%s",Integer.parseInt(arr[0]) + 1,arr[1]);
    }
}