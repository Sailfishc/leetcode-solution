package algorithm.SubarraysWithProductLessThanATarget;

import java.util.ArrayList;
import java.util.List;

import util.PrintUtils;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/RMV1GV1yPYz
 * @author sailfish
 * @create 2020-01-01-10:32 AM
 */
public class Solution {


    public static List<List<Integer>> findSubarrays(int[] arr, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("param is error");
        }
        for (int i = 0; i < arr.length; i++) {
            int sum = 1;
            List<Integer> subList = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                sum *= arr[j];
                if (sum < target) {
                    List<Integer> innerList = new ArrayList<>(subList);
                    innerList.add(arr[j]);
                    subList.add(arr[j]);
                    list.add(innerList);
                } else {
                    break;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        final List<List<Integer>> subarrays = findSubarrays(new int[]{8, 2, 6, 5}, 50);
        for (List<Integer> subarray : subarrays) {
            PrintUtils.println(subarray);
        }
    }
}
