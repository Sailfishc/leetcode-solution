package algorithm.L0049_GroupAnagrams;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-15-10:23 AM
 */
public class SolutionTest {

    @Test
    public void groupAnagrams() {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution solution = new Solution();
        final List<List<String>> lists = solution.groupAnagrams(strs);
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s + "  ");
            }
            System.out.println();
        }
    }


    @Test
    public void groupAnagramsToSolution() {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Solution2 solution = new Solution2();
        final List<List<String>> lists = solution.groupAnagrams(strs);
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s + "  ");
            }
            System.out.println();
        }
    }
}