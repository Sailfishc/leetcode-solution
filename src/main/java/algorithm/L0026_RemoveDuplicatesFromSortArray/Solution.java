package algorithm.L0026_RemoveDuplicatesFromSortArray;

/**
 * @author sailfish
 * @create 2019-11-30-7:36 下午
 */
public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }
        return count;

    }

}
