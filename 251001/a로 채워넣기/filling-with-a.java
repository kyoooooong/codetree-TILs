import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] arr = s.toCharArray();

        // 앞에서 두 번째 문자
        arr[1] = 'a';
        // 뒤에서 두 번째 문자
        arr[arr.length - 2] = 'a';

        // 바뀐 문자열 출력
        System.out.println(new String(arr));
    }
}