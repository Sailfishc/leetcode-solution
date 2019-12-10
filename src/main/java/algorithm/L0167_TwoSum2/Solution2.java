package algorithm.L0167_TwoSum2;

import util.ArrayHelper;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                return new int[]{i + 1, j + 1};
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Solution2 solution = new Solution2();
        final int[] ints = solution.twoSum(nums, 9);
        ArrayHelper.printArr(ints);
    }
}
