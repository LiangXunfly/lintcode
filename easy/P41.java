/**
 * Created by liangxunfly on 2019/3/11.
 */
import java.util.ArrayList;
import java.util.List;

public class P41 {
    public static void main(String[] args) {
        //int[] array = {-1, 0, -1, 2, 3, 5, -10, -5, -10, 20, -10, 1, -9};
        //int[] array = {-1, 0, 1};
        //int[] array = {5, -10, 4};
        //int[] array = {-2, 2, -3, 4, -1, 2, 1, -5, 3};
        int[] array = {-1,-2,-3,-100,-1,-50};
        System.out.println(maxSubArray(array));
    }

    public static int maxSubArray(int[] nums) {
        // write your code here
        int length = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        int first = 0;
        while (first < length) {
            int judge = 0;
            int current = length - 1;
            int lastindex = current;
            while (first < length && nums[first] <= 0) {
                first++;
            }
            if (first > length - 1) {
                break;
            }
            while (current > first) {
                judge += nums[current];
                if (judge <= 0) {
                    judge = 0;
                    lastindex = current - 1;
                }
                current--;
            }
            list.add(Integer.valueOf(nums[first] + judge));
            first++;
        }
        int result = 0;
        for (Integer i : list) {
            if (i > result) {
                result = i;
            }
        }
        if (result == 0) {
            result = nums[0];
            for (int i = 1; i < length; i++) {
                if (nums[i] > result) {
                    result = nums[i];
                }
            }
        }
        return result;
    }

    public static int maxSubArray2(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int result = dp[0];
        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            result = Math.max(dp[i], result);
        }
        return result;
    }
}