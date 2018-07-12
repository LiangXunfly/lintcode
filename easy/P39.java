public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
        // write your code here
        int size = nums.size();
        if (size == 0) {
            return;
        }
        int index = -1;
        for (int i = 0; i < size - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        int[] temp = new int[index + 1];
        for (int i = 0; i <= index; i++) {
            temp[i] = nums.get(i);
        }
        for (int i = index + 1; i < size; i++) {
            nums.set(i - index - 1, nums.get(i));
        }
        int j = 0;
        for (int i = size - 1 - index; i < size; i++) {
            nums.set(i, temp[j++]);
        }
    }
}