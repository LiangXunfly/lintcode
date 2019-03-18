import java.math.BigInteger;

/**
 * Created by liangxunfly on 2019/3/4.
 */

//import java.math.BigInteger;

public class P2 {
    public static void main(String[] args) {
         System.out.println(trailingZeros(29191991000000000L));
    }

    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long result = 0;
        if (n < 5) {
            return 0;
        }
        else {
            result = n / 5;
            long base = 5;
            int times = (int)(Math.log(n) / Math.log(5));
            for (int i = 2; i <= times; i++) {
                base *= 5;
                result += n / base;
            }
        }
        return result;
    }
}
