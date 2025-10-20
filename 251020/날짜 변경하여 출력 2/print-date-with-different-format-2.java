import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String[] arr = m.split("-");
        System.out.printf("%s.%s.%s",arr[0],arr[1],arr[2]);

    }
}