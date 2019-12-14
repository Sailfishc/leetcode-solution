package algorithm.L0018_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 和3Sum套路是一样的
 *
 * @author sailfish
 * @create 2019-12-14-11:17 AM
 */
public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resList = new ArrayList<>();

        if (nums.length < 4) {
            return resList;
        }
        Arrays.sort(nums);


        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int low = j + 1;
                int high = nums.length - 1;
                int needNum = target - nums[i] - nums[j];
                while (low < high) {
                    if (low < high && (nums[low] + nums[high] == needNum)) {
                        resList.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));

                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while (low < high && nums[high] == nums[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if (low < high && (nums[low] + nums[high] < needNum)) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return resList;
    }
}
