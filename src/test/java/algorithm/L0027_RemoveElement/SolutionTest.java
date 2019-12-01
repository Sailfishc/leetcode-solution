package algorithm.L0027_RemoveElement;

import org.junit.Test;

import util.ArrayHelper;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-01-11:32 上午
 */
public class SolutionTest {

    @Test
    public void removeElement() {
        int[] nums = {3, 2, 2, 3};
        Solution solution = new Solution();
        final int count = solution.removeElement(nums, 3);
        System.out.println("count=" + count);
        ArrayHelper.printArr(nums);
    }


    @Test
    public void removeElement2() {
        int[] nums = {3, 2, 2, 3};
        Solution2 solution = new Solution2();
        final int count = solution.removeElement(nums, 3);
        System.out.println("count=" + count);
        ArrayHelper.printArr(nums);
    }
}