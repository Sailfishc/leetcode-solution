package algorithm.L0001_TwoSum;


import org.junit.Test;

import util.ArrayHelper;

/**
 * @author sailfish
 * @create 2019-11-29-10:12 下午
 */
public class SolutionTest {


    @Test
    public void twoSum() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        final int[] ints = solution.twoSum(nums, 9);
        ArrayHelper.printArr(ints);
    }
}