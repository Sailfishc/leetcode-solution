package algorithm.L0080_RemoveDuplicatesFromSortArray2;

/**
 * @author sailfish
 * @create 2019-12-01-8:38 下午
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int count = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[count - 2]) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

}
