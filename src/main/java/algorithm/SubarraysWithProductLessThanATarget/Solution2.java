package algorithm.SubarraysWithProductLessThanATarget;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import util.PrintUtils;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/RMV1GV1yPYz
 *
 * @author sailfish
 * @create 2020-01-01-10:32 AM
 */
public class Solution2 {


    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int product = 1, left = 0;
        for (int right = 0; right < arr.length; right++) {
            product *= arr[right];
            while (product >= target && left < arr.length)
                product /= arr[left++];
            // since the product of all numbers from left to right is less than the target therefore,
            // all subarrays from lef to right will have a product less than the target too; to avoid
            // duplicates, we will start with a subarray containing only arr[right] and then extend it
            List<Integer> tempList = new LinkedList<>();
            for (int i = right; i >= left; i--) {
                tempList.add(0, arr[i]);
                result.add(new ArrayList<>(tempList));
            }
        }
        return result;
    }


    public static void main(String[] args) {
        final List<List<Integer>> subarrays = findSubarrays(new int[]{8, 2, 6, 5}, 50);
        for (List<Integer> subarray : subarrays) {
            PrintUtils.println(subarray);
        }
    }
}
