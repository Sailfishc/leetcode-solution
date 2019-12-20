package algorithm.L0015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author sailfish
 * @create 2019-12-13-10:12 PM
 */
public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int low = i + 1;
            int high = nums.length - 1;
            int target = 0 - nums[i];
            while (low < high) {
                if (low < high && (nums[low] + nums[high] == target)) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (low < high && (nums[low] + nums[high] < target)) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return res;
    }
}
