public class P241 {
    /**
     * @param str: A string
     * @return: An integer
     */
    public int stringToInteger(String str) {
        // write your code here
        if (str == "") {
        	return 0;
        }
        int result = 0;
        int length = str.length();
        if (str.charAt(0) == '-') {
        	for (int i = 1; i < length; i++) {
        		result -= ((int)str.charAt(i) - 48) * Math.pow(10, length - i - 1);
        	}
        }
        else {
	        for (int i = 0; i < length; i++) {
	        	result += ((int)str.charAt(i) - 48) * Math.pow(10, length - i - 1);
	        }
   		}
        return result;
    }

    public static void main(String[] args) {
   		String str = "-2147483648";
    	int result = 0;
        int length = str.length();
        if (str.charAt(0) == '-') {
        	for (int i = 1; i < length; i++) {
        		result -= ((int)str.charAt(i) - 48) * Math.pow(10, length - i - 1);
       		}
        }
        else {
	        for (int i = 0; i < length; i++) {
	        	result += ((int)str.charAt(i) - 48) * Math.pow(10, length - i - 1);
	        }
   		}
        System.out.println(result);
    }
}