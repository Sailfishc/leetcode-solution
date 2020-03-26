package algorithm.L0283_MoveZeros;

/**
 * @author sailfish
 * @create 2020-03-26-1:52 PM
 */
public class Solution3 {


    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        int nonZero = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                nums[nonZero++] = nums[index];
            }
        }

        while (nonZero < nums.length) {
            nums[nonZero++] = 0;

        }
    }
}
