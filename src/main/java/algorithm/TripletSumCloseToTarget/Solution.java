package algorithm.Solution;

import java.util.Arrays;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/3YlQz7PE7OA
 *
 * @author sailfish
 * @create 2019-12-31-11:47 AM
 */
@Deprecated
public class Solution {


//    Input: [1, 0, 1, 1], target=100
//    Output: 3
//    Explanation: The triplet [1, 1, 1] has the closest sum to the target.


    /**
     * 这一个解题思路是有的，但是写得太啰嗦了
     *
     * @param arr
     * @param targetSum
     * @return
     */
    public static int searchTriplet(int[] arr, int targetSum) {
        Arrays.sort(arr);
        int sum = 0;
        int minDiff = -Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int target = targetSum - arr[i];
                final int value = arr[start] + arr[end];
                if (value == target) {
                    sum = arr[i] + arr[start] + arr[end];
                    return sum;
                } else if (value < target) {
                    int diff = target - value;
                    if (Math.abs(diff) < Math.abs(minDiff)) {
                        sum = arr[i] + arr[start] + arr[end];
                        minDiff = diff;
                    }
                    start++;
                } else {
                    int diff = target - value;
                    if (minDiff > 0) {
                        end--;
                        continue;
                    }
                    if (diff < minDiff) {
                        sum = arr[i] + arr[start] + arr[end];
                        minDiff = diff;
                    }
                    end--;
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(Solution.searchTriplet(new int[] { -2, 0, 1, 2 }, 2));
        System.out.println(Solution.searchTriplet(new int[] { -3, -1, 1, 2 }, 1));
        System.out.println(Solution.searchTriplet(new int[] { 1, 0, 1, 1 }, 100));
    }

}
