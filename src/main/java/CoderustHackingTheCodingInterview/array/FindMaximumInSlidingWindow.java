package CoderustHackingTheCodingInterview.array;

import util.ArrayHelper;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/k5llE
 */
public class FindMaximumInSlidingWindow {

//    Given an array of integers, find the maximum value in a window.

    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
       int i = 0, j = 1;
        int max = arr[0];
        while (j < arr.length) {
            if (j - i + 1 <= windowSize) {
                max = Math.max(max, arr[j]);
                j++;
            }

        }
        return result;
    }



    /*
           思路：
                1. 设置双端队列
                2. 遍历数组
                3. 如果队列不为空并且队首元素等于上一个窗口队首元素，则删除
                4. 如果队尾元素的值小于窗口队尾元素的值，则删除队尾元素
                5. 将数组下标加入队列
                6. 从[窗口, 数组长度+1] 取值

     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || nums.length < k) {
            return new int[0];
        }

        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length + 1 - k];
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.poll();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            }
            deque.offerLast(i);

            // 为啥是i+1 >= k 而不是 > k
            if (i + 1 >= k) {
                res[i + 1 - k] = nums[deque.peek()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        final int[] result = maxSlidingWindow(arr, 3);
        ArrayHelper.printArr(result);
    }

}
