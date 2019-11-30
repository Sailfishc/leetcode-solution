package algorithm.L0283_MoveZeros;

import util.ArrayHelper;

/**
 * @author sailfish
 * @create 2019-11-29-9:56 下午
 */
public class Solution2 {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }

        int nonZero = 0;
        int cur = 0;
        while (cur < nums.length) {
            if (nums[cur] != 0) {
                ArrayHelper.swap(nums, nonZero++, cur);
            }
            cur++;
        }
    }

}
