/**
 * Created by liangxunfly on 2019/3/15.
 */
import java.util.List;
import java.util.Arrays;

public class P44 {
    public static void main(String[] args) {
        Integer[] array = {1, -1, -2, 1};
        List<Integer> list = Arrays.asList(array);
        System.out.println(minSubArray(list));
    }

    public static int minSubArray(List<Integer> nums) {
        // write your code here
        int length = nums.size();
        if (length == 0) {
            return 0;
        }
        int[] dp = new int[length];
        dp[0] = nums.get(0);
        int result = dp[0];
        for (int i = 1; i < length; i++) {
            int current = nums.get(i);
            dp[i] = Math.min(dp[i - 1] + current, current);
            result = Math.min(result, dp[i]);
        }
        return result;
    }
}
