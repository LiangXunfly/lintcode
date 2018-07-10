public class Solution {
    /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long result = 0;
        if (n == 5) {
        	return 1;
        }
        else if (n < 10) {
        	return 0;
        }
        result = n / 10 * 2;
        int last = (int)n % 10;
        if (last >= 5) {
        	result++;
        }
        return result;
    }
}