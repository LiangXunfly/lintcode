public class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int length = nums.length;
        if (length == 0) {
        	return -1;
        }
        int start = 0;
        int end = -1; 
        int result = -1;
        while (start <= end) {
	        int middle = (end - start) / 2 + start;
	        if (target > nums[middle]) {
	        	start = middle + 1;
	        }
	        else if (target == nums[middle]) {
	        	result = middle;
	        	end = middle - 1;
	        }
	        else {
	        	end = middle - 1;
	        }
	    }
	    return result;


	    int length = nums.length;
        if (length == 0) {
            return -1;
        }
        int start = 0;
        int end = length - 1;
        int result = -1;
        while (start <= end) {
            int middle = (end - start) / 2 + start;
            if (target > nums[middle]) {
                start = middle + 1;
            }
            else if (target == nums[middle]) {
                result = middle;
                end = middle - 1;
            }
            else {
                end = middle - 1;
            }
        }
        return result;
    }
}