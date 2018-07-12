public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        String sTrim = s.trim();
        String[] array = sTrim.split(" +");
        String result = "";
        int length = array.length;
        for (int i = length - 1; i >= 0; i--) {
            if (i == 0) {
                result += array[i];
            }
            else {
                result += array[i] + " ";
            }
        }
        return result;
    }
}