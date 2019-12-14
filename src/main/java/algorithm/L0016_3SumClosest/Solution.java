package algorithm.L0016_3SumClosest;

import java.util.Arrays;

/**
 * @author sailfish
 * @create 2019-12-14-9:58 AM
 */
public class Solution {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        // 最接近的数值
        int diff = Math.abs(closest - target);
        for (int i = 1; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                int newDiff = Math.abs(sum - target);
                if (newDiff < diff) {
                    closest = sum;
                    diff = newDiff;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closest;
    }
}
