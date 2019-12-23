package algorithm.PermutationInAString;

import java.util.Arrays;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/N8vB7OVYo2D
 */
public class Solution {


    public static boolean findPermutation(String str, String pattern) {
        // TODO: Write your code here
        int winStart = 0, winEnd = 0;
        final char[] patternChar = pattern.toCharArray();
        Arrays.sort(patternChar);
        while (winEnd < str.length()) {
            while (winEnd - winStart + 1 < pattern.length()) {
                winEnd++;
            }
            final String substring = str.substring(winStart, winEnd + 1);
            final char[] chars = substring.toCharArray();
            Arrays.sort(chars);
            if (Arrays.equals(chars, patternChar)) {
                return true;
            }
            winEnd++;
            winStart++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Solution.findPermutation("oidbcaf", "abc"));
        System.out.println(Solution.findPermutation("odicf", "dc"));
        System.out.println(Solution.findPermutation("bcdxabcdy", "bcdyabcdx"));
        System.out.println(Solution.findPermutation("aaacb", "abc"));
    }
}
