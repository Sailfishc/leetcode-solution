package algorithm.LongestSubarrayWithOnesAfterReplacement;

/**
 * @author sailfish
 * @create 2019-12-20-6:54 PM
 */
public class Solution {


    public static int findLength(int[] arr, int k) {
        // TODO: Write your code here
        int maxLen = 0;
        int start = 0, end = 0;
        int maxOneNum = 0;
        while (++end < arr.length) {
            if (arr[end] == 1) {
                maxOneNum++;
            }

            if (end - start + 1 - maxOneNum > k) {
                if (arr[start] == 1) {
                    maxOneNum--;
                }
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(Solution.findLength(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2));
        System.out.println(Solution.findLength(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
    }
}
