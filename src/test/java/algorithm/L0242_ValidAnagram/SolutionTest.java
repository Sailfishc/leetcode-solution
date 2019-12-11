package algorithm.L0242_ValidAnagram;

import org.junit.Test;

public class SolutionTest {


    @Test
    public void isAnagram() {
        Solution solution = new Solution();

        String s = "anagram", t = "nagaram";
        final boolean anagram = solution.isAnagram(s, t);
        System.out.println(anagram);
    }


    @Test
    public void isNotAnagram() {
        String s = "rat", t = "car";
        Solution solution = new Solution();

        final boolean anagram = solution.isAnagram(s, t);
        System.out.println(anagram);
    }
}
