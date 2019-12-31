package algorithm.SquaringASortedArray;

import util.ArrayHelper;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/R1ppNG3nV9R
 *
 * @author sailfish
 * @create 2019-12-31-9:38 AM
 */
public class Solution3 {


//    Input: [-3, -1, 0, 1, 2]
//    Output: [0 1 1 4 9]

//    Input: [-2, -1, 0, 2, 3]
//    Output: [0, 1, 4, 4, 9]


    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int start = 0, end = arr.length - 1;
        int index = arr.length - 1;
        while (start < end) {
            int leftSqu = arr[start] * arr[start];
            int rightSqu = arr[end] * arr[end];
            if (leftSqu < rightSqu) {
                squares[index--] = rightSqu;
                end--;
            } else {
                squares[index--] = leftSqu;
                start++;
            }

        }
        return squares;
    }


    public static void main(String[] args) {
        ArrayHelper.printArr(makeSquares(new int[]{-2, -1, 0, 2, 3}));
        ArrayHelper.printArr(makeSquares(new int[]{-3, -1, 0, 1, 2}));

    }
}
