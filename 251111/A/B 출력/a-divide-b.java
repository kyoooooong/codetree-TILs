import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal a = sc.nextBigDecimal();
        BigDecimal b = sc.nextBigDecimal();

        BigDecimal result = a.divide(b, 20, RoundingMode.DOWN); // 소수점 아래 20자리, 버림
        System.out.println(result);
    }
}
