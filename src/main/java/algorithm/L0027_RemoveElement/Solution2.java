package algorithm.L0027_RemoveElement;

/**
 * @author sailfish
 * @create 2019-11-30-7:36 下午
 */
public class Solution2 {

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }

}
