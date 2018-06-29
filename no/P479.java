public class Solution {
    /**
     * @param nums: An integer array
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        // write your code here
        int max = nums[0];
        int second = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; i++) {
        	//倒序
            if (second == max && second > nums[i]) {
                second = nums[i];
            }
            if (nums[i] >= max) {
                second = max;
                max = nums[i];
            }
            else if (nums[i] < max && nums[i] > second) {
                second = nums[i];
            }
        }
        return second;
    }
}