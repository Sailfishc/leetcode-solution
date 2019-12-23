package algorithm.StringAnagrams;


import util.PrintUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {


    public static List<Integer> findStringAnagrams(String str, String pattern) {
        int windowStart = 0, matched = 0;
        List<Integer> resultIndices = new ArrayList<Integer>();
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            charFrequencyMap.put(pattern.charAt(i), charFrequencyMap.getOrDefault(pattern.charAt(i), 0) + 1);
        }

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            final char rightChar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) == 0) {
                    matched++;
                }
            }

            if (matched == charFrequencyMap.size()) {
                resultIndices.add(windowStart);
            }

            if (windowEnd >= pattern.length() - 1) { // shrink the window by one character
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0)
                        matched--; // before putting the character back, decrement the matched count
                    // put the character back for matching
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }
        return resultIndices;
    }

    public static void main(String[] args) {
        System.out.println(Solution.findStringAnagrams("abbcabc", "abc"));
        System.out.println(Solution.findStringAnagrams("ppqp", "pq"));
    }
}
