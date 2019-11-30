package algorithm.L0283_MoveZeros;

/**
 * @author sailfish
 * @create 2019-11-29-9:56 下午
 */
public class Solution {

    public void moveZeroes(int[] nums) {
        if (nums == null) {
            return;
        }
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[j++] = nums[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }

}
