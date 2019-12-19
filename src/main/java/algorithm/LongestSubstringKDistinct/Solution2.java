package algorithm.LongestSubstringKDistinct;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/YQQwQMWLx80
 *
 * @author sailfish
 * @create 2019-12-19-9:37 AM
 */
public class Solution2 {

    public  int findLength(String str, int k) {
        // TODO: Write your code here
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0, end = 0;
        for (; end < str.length(); end++) {
            Character key = str.charAt(end);
            map.put(key, map.getOrDefault(key, 0) + 1);

            while (map.keySet().size() > k) {
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                if (map.get(str.charAt(start)) == 0) {
                    map.remove(str.charAt(start));
                }
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

}
