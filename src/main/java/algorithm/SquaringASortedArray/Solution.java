package algorithm.SquaringASortedArray;

import util.ArrayHelper;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/R1ppNG3nV9R
 *
 * @author sailfish
 * @create 2019-12-31-9:38 AM
 */
public class Solution {


//    Input: [-3, -1, 0, 1, 2]
//    Output: [0 1 1 4 9]

//    Input: [-2, -1, 0, 2, 3]
//    Output: [0, 1, 4, 4, 9]

//    想法：
//    1. 相同的元素顺序性？
//    2. 能否调用系统排序函数？

    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        // TODO: Write your code here
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (Math.abs(arr[start]) > Math.abs(arr[end])) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            squares[i] = arr[i] * arr[i];
        }
        return squares;
    }


    public static void main(String[] args) {
        ArrayHelper.printArr(makeSquares(new int[]{-2, -1, 0, 2, 3}));
        ArrayHelper.printArr(makeSquares(new int[]{-3, -1, 0, 1, 2}));

    }
}
