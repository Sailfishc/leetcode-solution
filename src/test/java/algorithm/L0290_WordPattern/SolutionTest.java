package algorithm.L0290_WordPattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void wordPattern() {
        Solution solution = new Solution();
        String pattern = "abba", str = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, str));
    }

    @Test
    public void isNotWordPattern() {
        String pattern = "abba", str = "dog cat cat fish";
        Solution solution = new Solution();
        System.out.println(solution.wordPattern(pattern, str));
    }
}