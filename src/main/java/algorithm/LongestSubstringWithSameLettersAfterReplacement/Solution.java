package algorithm.LongestSubstringWithSameLettersAfterReplacement;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/R8DVgjq78yR
 *
 * @author sailfish
 * @create 2019-12-20-3:52 PM
 */
public class Solution {

    public static int findLength(String str, int k) {
        // TODO: Write your code here
        int maxLen = 0;
        for (int start = 0; start < str.length() - 1; start++) {
            int count = 0;
            int end = start + 1;
            while (end < str.length()) {
                if (str.charAt(end) == str.charAt(start)) {
                    end++;
                    continue;
                }
                if (count++ >= k) {
                    break;
                }
                end++;
            }
            maxLen = Math.max(maxLen, end - start);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(Solution.findLength("aabccbb", 2));
        System.out.println(Solution.findLength("abbcb", 1));
        System.out.println(Solution.findLength("abccde", 1));
    }
}
