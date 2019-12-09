package algorithm.L0215_KthLargestElementInAnArray;

import util.ArrayHelper;

public class Solution {


    public int findKthLargest(int[] nums, int k) {

        quickSort(nums, 0, nums.length, k);
        return nums[k - 1];
    }

    private void quickSort(int[] nums, int l, int r, int k) {
        if (l >= r) {
            return;
        }

        int p = partition(nums, l, r);

        if (p + 1 == k) {
            return;
        } else if (p + 1 > k) {
            quickSort(nums, l, p - 1, k);
        } else {
            quickSort(nums, p + 1, r, k);
        }

    }

    private int partition(int[] nums, int l, int r) {

        int v = nums[l];
        int j = l;
        for (int i = l + 1; i < r; i++) {
            if (nums[i] < v) {
                swap(nums, i, j + 1);
                j++;
            }
        }

        swap(nums, l, j);
        return j;
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
