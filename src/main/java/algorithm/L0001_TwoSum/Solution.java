package algorithm.L0001_TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-13-9:34 PM
 */
public class Solution {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}
