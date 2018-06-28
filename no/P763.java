public class Solution {
    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public String hexConversion(int n, int k) {
        // write your code here
        String result = "";
        while (n >= k) {
        	int remainer = n % k;
        	if (remainer >= 10) {
        		if (remainer == 10) {
    				result = "A" + result;
	    		}
	    		else if (remainer == 11) {
	    			result = "B" + result;
	    		}
	    		else if (remainer == 12) {
	    			result = "C" + result;
	    		}
	    		else if (remainer == 13) {
	    			result = "D" + result;
	    		}
	    		else if (remainer == 14) {
	                result = "E" + result;
	            }
	            else if (remainer == 15) {
	                result = "F" + result;
	            }
        	}
        	else {
        		result = n % k + result;
        	}
        	n = n / k;
        }
        if (n >= 10) {
    		if (n == 10) {
    			result = "A" + result;
    		}
    		else if (n == 11) {
    			result = "B" + result;
    		}
    		else if (n == 12) {
    			result = "C" + result;
    		}
    		else if (n == 13) {
    			result = "D" + result;
    		}
    		else if (n == 14) {
                result = "E" + result;
            }
            else if (n == 15) {
                result = "F" + result;
            }
        }
    	else {
    		result = n + result;
    	}
        return result;
    }
}