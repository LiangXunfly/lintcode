public class Solution {
    /**
     * @param n: An integer
     * @return: A list of strings.
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        String[] result = new String[n];
        for (int i = 1; i <= n; i++) {
        	if (i % 15 == 0) {
        		result[i - 1] = "fizz buzz";
        	}
        	else if (i % 3 == 0) {
        		result[i - 1] = "fizz";
        	}
        	else if (i % 5 == 0) {
        		result[i - 1] = "buzz";
        	}
        	else {
        		result[i - 1] = "" + i;
        	}
        }
        return Arrays.asList(result);
    }
}