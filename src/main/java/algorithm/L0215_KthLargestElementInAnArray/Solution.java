package algorithm.L0215_KthLargestElementInAnArray;

import util.ArrayHelper;

public class Solution {


    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (true) {

            final int p = partition(nums, left, right);
            if (p + 1 == k) {
                return nums[p];
            } else if (p + 1 > k) {
                right = p - 1;
            } else {
                left = p + 1;
            }
        }
    }


    private int partition(int[] nums, int left, int right) {

        int v = nums[left];
        int l = left + 1;
        int r = right;
        while (l <= r) {
            if (nums[l] < v && nums[r] > v) {
                swap(nums, l++, r--);
            }
            if (nums[l] >= v) {
                l++;
            }

            if (nums[r] <= v) {
                r--;
            }
        }

        swap(nums, left, r);
        return r;
    }


    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        final int[] nums = ArrayHelper.generateRandomArray(8, 1, 100);
        ArrayHelper.printArr(nums);
        final int kthLargest = solution.findKthLargest(nums, 3);
        System.out.println("kth Largest:" + kthLargest);
    }
}
