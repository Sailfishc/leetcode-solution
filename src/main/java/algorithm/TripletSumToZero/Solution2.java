package algorithm.TripletSumToZero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import util.PrintUtils;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/gxk639mrr5r
 *
 * @author sailfish
 * @create 2019-12-31-11:14 AM
 */
public class Solution2 {

//    Input: [-3, 0, 1, 2, -1, 1, -2]
//    Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
//    Explanation: There are four unique triplets whose sum is equal to zero.

    public static List<List<Integer>> searchTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int target = 0 - arr[i];
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int sum = arr[start] + arr[end];
                if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                } else {
                    triplets.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    start++;
                    end--;
                    while (start < end && arr[start] == arr[start - 1]) {
                        start++;
                    }

                    while (start < end && arr[end] == arr[end + 1]) {
                        end--;
                    }
                }
            }
        }
        return triplets;
    }


    public static void main(String[] args) {
        final List<List<Integer>> lists = searchTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2});
        for (List<Integer> list : lists) {
            PrintUtils.println(list);
        }

        System.out.println("-----------------");

        final List<List<Integer>> lists2 = searchTriplets(new int[]{-5, 2, -1, -2, 3});
        for (List<Integer> list : lists2) {
            PrintUtils.println(list);
        }

    }
}


