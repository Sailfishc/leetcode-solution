package algorithm.L0242_ValidAnagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void isAnagram() {
        Solution2 solution = new Solution2();

        String s = "anagram", t = "nagaram";
        final boolean anagram = solution.isAnagram(s, t);
        System.out.println(anagram);
    }


    @Test
    public void isNotAnagram() {
        String s = "rat", t = "car";
        Solution2 solution = new Solution2();

        final boolean anagram = solution.isAnagram(s, t);
        System.out.println(anagram);
    }
}