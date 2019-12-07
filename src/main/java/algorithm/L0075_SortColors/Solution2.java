package algorithm.L0075_SortColors;

/**
 * 三路快排
 */
public class Solution2 {

    public void sortColors(int[] nums) {

        int zero = -1;
        int two = nums.length;

        for (int i = 0; i < two; ) {
            if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                two--;
                swap(nums, i, two);
            } else {
                // nums[i] = 0
                zero++;
                swap(nums, i, zero);
                i++;
            }
        }
    }


    private void swap(int[] nums, int p, int q) {
        int temp = nums[p];
        nums[p] = nums[q];
        nums[q] = temp;
    }

}
