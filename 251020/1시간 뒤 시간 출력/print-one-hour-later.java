import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String[] arr = m.split(":");
        arr[0] = int(arr[0]) + 1;

        System.out.printf("%d:%s",arr[0],arr[1]);
    }
}