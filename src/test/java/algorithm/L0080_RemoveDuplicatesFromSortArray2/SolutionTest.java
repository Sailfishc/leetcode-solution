package algorithm.L0080_RemoveDuplicatesFromSortArray2;

import org.junit.Test;

import util.ArrayHelper;

/**
 * @author sailfish
 * @create 2019-12-01-9:27 下午
 */
public class SolutionTest {

    @Test
    public void removeDuplicates() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        Solution solution = new Solution();
        final int count = solution.removeDuplicates(nums);
        System.out.println("len=" + count);
        ArrayHelper.printArr(nums);
        
    }
}