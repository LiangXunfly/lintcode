public class Solution {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        int length = str.length;
        if (length == 0) {
        	return;
        }
        offset = offset % length;
        if (offset == 0) {
            return;
        }
        char[] temp = new char[offset];
        for (int i = 0; i < offset; i++) {
            temp[i] = str[length - offset + i];
        }
        for (int i = length - offset - 1; i >= 0; i--) {
            str[i + offset] = str[i];
        }
        for (int i = 0; i < offset; i++) {
            str[i] = temp[i];
        }
    }
}