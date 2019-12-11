package algorithm.L0242_ValidAnagram;

import java.util.Arrays;

public class Solution2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        final char[] char1 = s.toCharArray();
        final char[] char2 = t.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }
}
