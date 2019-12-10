package algorithm.L0167_TwoSum2;

import util.ArrayHelper;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i + 1);
        }

        for (int i = 0; i < numbers.length; i++) {
            int val = target - numbers[i];
            if (map.containsKey(val)) {
                return new int[]{i + 1, map.get(val)};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Solution solution = new Solution();
        final int[] ints = solution.twoSum(nums, 9);
        ArrayHelper.printArr(ints);
    }
}
