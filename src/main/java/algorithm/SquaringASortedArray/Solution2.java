package algorithm.SquaringASortedArray;

import util.ArrayHelper;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/R1ppNG3nV9R
 *
 * @author sailfish
 * @create 2019-12-31-9:38 AM
 */
public class Solution2 {


//    Input: [-3, -1, 0, 1, 2]
//    Output: [0 1 1 4 9]

//    Input: [-2, -1, 0, 2, 3]
//    Output: [0, 1, 4, 4, 9]


    public static int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int noNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                noNegative = i;
                break;
            }
        }

        int pre = (noNegative - 1) >= 0 ? (noNegative - 1) : 0;
        int next = noNegative;
        for (int i = 0; i < arr.length; i++) {
            if (pre < 0) {
                squares[i] = arr[next] * arr[next];
                next++;
                continue;
            }
            if (next > arr.length - 1) {
                squares[i] = arr[pre] * arr[pre];
                pre--;
                continue;
            }
            if (Math.abs(arr[pre]) < Math.abs(arr[next])) {
                squares[i] = arr[pre] * arr[pre];
                pre--;
            } else {
                squares[i] = arr[next] * arr[next];
                next++;
            }
        }
        return squares;
    }


    public static void main(String[] args) {
        ArrayHelper.printArr(makeSquares(new int[]{-2, -1, 0, 2, 3}));
        ArrayHelper.printArr(makeSquares(new int[]{-3, -1, 0, 1, 2}));

    }
}
