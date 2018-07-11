public class Solution {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here
        if (source == null || target == null) {
        	return -1;
        }
        int sourceLength = source.length();
        int targetLength = target.length();
        if (targetLength > sourceLength) {
        	return -1;
        }
        if (source == "" && target == "") {
        	return 0;
        }
        if (targetLength == sourceLength && source.charAt(0) != target.charAt(0)) {
        	return -1;
        }
        for (int i = 0; i <= sourceLength - targetLength; i++) {
        	if (source.substring(i, i + targetLength).equals(target)) {
        		return i;
        	}
        }
        return -1;
    }
}