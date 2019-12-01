package algorithm.L0026_RemoveDuplicatesFromSortArray;

import org.junit.Test;

import util.ArrayHelper;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-01-9:52 上午
 */
public class SolutionTest {

    @Test
    public void removeDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        ArrayHelper.printArr(nums);
        Solution solution = new Solution();
        final int count = solution.removeDuplicates(nums);
        System.out.println("count=" + count);
        ArrayHelper.printArr(nums);
    }
}