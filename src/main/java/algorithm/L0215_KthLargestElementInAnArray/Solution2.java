package algorithm.L0215_KthLargestElementInAnArray;

import util.ArrayHelper;

import java.util.PriorityQueue;


/**
 * 使用堆来解决
 *
 */
public class Solution2 {

    // 使用最小堆来模拟最大堆
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
       return minHeap.poll();
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        final int[] nums = ArrayHelper.generateRandomArray(8, 1, 100);
        ArrayHelper.printArr(nums);
        final int kthLargest = solution.findKthLargest(nums, 3);
        System.out.println("kth Largest:" + kthLargest);
    }
}
