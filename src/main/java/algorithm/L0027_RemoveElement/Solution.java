package algorithm.L0027_RemoveElement;

/**
 * @author sailfish
 * @create 2019-11-30-7:36 下午
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                count++;
            } else {
                if (swap(nums, i)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean swap(int[] nums, int i) {
        for (int j = i+1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                return true;
            }
        }
        return false;
    }

}
