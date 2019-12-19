package algorithm.LongestSubstringKDistinct;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-19-10:57 AM
 */
public class Solution2Test {

    @Test
    public void findLength() {

        String s = "araaci";
        int K = 2;
        Solution2 solution = new Solution2();
        final int length = solution.findLength(s, K);
        Assert.assertEquals(4, length);
    }

    @Test
    public void testFindLength2() {
        String s = "araaci";
        int K = 1;
        Solution2 solution = new Solution2();
        final int length = solution.findLength(s, K);
        Assert.assertEquals(2, length);
    }


    @Test
    public void testFindLength3() {
        String s = "cbbebi";
        int K = 3;
        Solution2 solution = new Solution2();
        final int length = solution.findLength(s, K);
        Assert.assertEquals(5, length);
    }
}