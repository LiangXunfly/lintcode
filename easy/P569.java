/**
 * Created by liangxunfly on 2019/3/13.
 */
public class P569 {
    public static void main(String[] args) {

    }

    public static int addDigits(int num) {
        // write your code here
        if (num == 0) {
            return 0;
        }
        else if (num % 9 == 0) {
            return 9;
        }
        else {
            return num % 9;
        }
    }
}
