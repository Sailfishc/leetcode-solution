package algorithm.NoRepeatSubString;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/YMzBx1gE5EO
 * @author sailfish
 * @create 2019-12-20-3:13 PM
 */
public class Solution {


    public static int findLength(String str) {

        int maxLen = 0;
        int start = 0, end = 0;
        Set<Character> set = new HashSet<>();
        for (; end < str.length(); end++) {
            if (set.contains(str.charAt(end))) {
                maxLen = Math.max(maxLen, end - start);
                set.clear();
                start = end;
            }
            set.add(str.charAt(end));
        }

        return maxLen;
    }


    public static void main(String[] args) {
        System.out.println(Solution.findLength("aabccbb"));
        System.out.println(Solution.findLength("abbbb"));
        System.out.println(Solution.findLength("abccde"));
    }
}
