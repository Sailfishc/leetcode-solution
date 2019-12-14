package algorithm.L0016_3SumClosest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-14-10:22 AM
 */
public class SolutionTest {

    @Test
    public void threeSumClosest() {
        int[] nums = {-1, 2, 1, -4};
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(nums, 1));
        Assert.assertEquals(2, solution.threeSumClosest(nums, 1));
    }


    @Test
    public void testThreeSumClosetFirstErrorCase() {
        int[] nums = {0, 2, 1, -3};
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(nums, 1));
        Assert.assertEquals(0, solution.threeSumClosest(nums, 1));

    }
}