public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
       	ArrayList<Long> result = new ArrayList<Long>();
       	int size = nums.size();
       	for (int i = 0; i < size; i++) {
       		long product = 1;
       		for (int j = 0; j < size; j++) {
       			if (j != i) {
       				product *= nums.get(j);
       			}
       		}
       		result.add(product);
       	}
       	return result;
    }
}