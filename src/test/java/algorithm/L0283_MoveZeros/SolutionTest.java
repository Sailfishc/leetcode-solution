package algorithm.L0283_MoveZeros;

import org.junit.Test;

import util.ArrayHelper;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-11-30-6:39 下午
 */
public class SolutionTest {

    @Test
    public void moveZeroes() {
        int[] nums = {0, 1, 0, 3, 12};

        Solution solution = new Solution();
        solution.moveZeroes(nums);

        ArrayHelper.printArr(nums);
    }


    @Test
    public void moveZeroesToSolution() {
        int[] nums = {0, 1, 0, 3, 12};

        Solution2 solution = new Solution2();
        solution.moveZeroes(nums);

        ArrayHelper.printArr(nums);
    }
}