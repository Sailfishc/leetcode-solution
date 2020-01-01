package algorithm.TripletSumCloseToTarget;

import java.util.Arrays;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/3YlQz7PE7OA
 *
 * @author sailfish
 * @create 2019-12-31-11:47 AM
 */
public class Solution2 {


//    Input: [1, 0, 1, 1], target=100
//    Output: 3
//    Explanation: The triplet [1, 1, 1] has the closest sum to the target.


    public static int searchTriplet(int[] arr, int targetSum) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1, end = arr.length - 1;
            while (start < end) {
                int diff = targetSum - arr[i] - arr[start] - arr[end];
                if (diff == 0) {
                    return targetSum - diff;
                }

                // 关键思路
                if (Math.abs(diff) < Math.abs(minDiff) || (Math.abs(diff) == Math.abs(minDiff) && diff > minDiff)) {
                    minDiff = diff;
                }

                if (diff > 0) {
                    // 说明值小了
                    start++;
                } else {
                    end--;
                }
            }
        }
        return targetSum - minDiff;
    }


    public static void main(String[] args) {
        System.out.println(Solution2.searchTriplet(new int[]{-2, 0, 1, 2}, 2));
        System.out.println(Solution2.searchTriplet(new int[]{-3, -1, 1, 2}, 1));
        System.out.println(Solution2.searchTriplet(new int[]{1, 0, 1, 1}, 100));
    }

}
