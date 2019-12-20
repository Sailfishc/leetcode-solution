package algorithm.LongestSubstringWithSameLettersAfterReplacement;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-20-4:41 PM
 */
public class Solution2 {

    public static int findLength(String str, int k) {
        int windowStart = 0, maxLength = 0, maxRepeatLetterCount = 0;
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character rightKey = str.charAt(windowEnd);
            letterFrequencyMap.put(rightKey, letterFrequencyMap.getOrDefault(rightKey, 0) + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFrequencyMap.get(rightKey));

            if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
                // 说明替k个替换元素已经不够了,要移动start指针
                Character leftKey = str.charAt(windowStart);
                letterFrequencyMap.put(leftKey, letterFrequencyMap.get(leftKey) - 1);
                windowStart++;
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(Solution2.findLength("aabccbb", 2));
        System.out.println(Solution2.findLength("abbcb", 1));
        System.out.println(Solution2.findLength("abccde", 1));
    }
}
