package algorithm.TripletsWithSmallerSum;

import java.util.Arrays;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/mElknO5OKBO
 *
 * @author sailfish
 * @create 2020-01-01-9:43 AM
 */
public class Solution {


    public static int searchTriplets(int[] arr, int target) {
        int count = 0;
        if (arr == null || arr.length < 2) {
            return 0;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1, end = arr.length - 1;
            while (start < end) {
                int sum = arr[i] + arr[start] + arr[end];
                if (sum - target < 0) {
                    // 这个思路挺好的，在排序的数组中 [ a,b,c,d],a+d小于Y，则a+c和a+b都小于Y
                    count += end - start;
                    start++;
                } else {
                    end--;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(searchTriplets(new int[]{-1, 0, 2, 3}, 3));
        System.out.println(searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5));

    }
}
