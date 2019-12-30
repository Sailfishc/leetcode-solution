package algorithm.PairWithTargetSum;

import util.ArrayHelper;

/**
 * @author sailfish
 * @create 2019-12-30-10:09 PM
 */
public class Solution {

    public static int[] search(int[] arr, int targetSum) {
        // TODO: Write your code here
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == targetSum) {
                return new int[]{start, end};
            } else if (arr[start] + arr[end] < targetSum) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        ArrayHelper.printArr(search(new int[]{2, 5, 9, 11}, 11));
        ArrayHelper.printArr(search(new int[]{1, 2, 3, 4, 6}, 6));
    }
}
