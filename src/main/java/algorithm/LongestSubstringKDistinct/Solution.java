package algorithm.LongestSubstringKDistinct;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/YQQwQMWLx80
 *
 * @author sailfish
 * @create 2019-12-19-9:37 AM
 */
public class Solution {

    public int findLength(String str, int k) {
        // TODO: Write your code here
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0, j = 0;
        while (j < str.length()) {
            while (map.keySet().size() < k || map.keySet().contains(str.charAt(j))) {
                char key = str.charAt(j);
                map.put(key, map.getOrDefault(key, 0) + 1);
                j++;
            }
            maxLen = Math.max(maxLen, map.values().stream().reduce(0, (a, b) -> a + b));
            if (map.containsKey(str.charAt(i))) {
                if (map.get(str.charAt(i)) == 1) {
                    map.remove(str.charAt(i));
                } else {
                    map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
                }

            } else {

            }
            i++;
            j++;
        }
        return maxLen;
    }
}
