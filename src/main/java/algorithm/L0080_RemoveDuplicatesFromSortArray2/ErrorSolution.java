package algorithm.L0080_RemoveDuplicatesFromSortArray2;

/**
 * 保留错误的解题思路，提供给之后再看的时候回顾
 *
 * @author sailfish
 * @create 2019-12-01-8:38 下午
 */
public class ErrorSolution {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int len = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[len++] = nums[i];
                if (count > 2) {
                    count = 2;
                } else {
                    count = 1;
                }
            } else if (nums[i] == nums[i - 1] && count < 2) {
                count++;
                len++;
            } else {
                // 大于等于2
                count++;
            }
        }
        return len;
    }

}
