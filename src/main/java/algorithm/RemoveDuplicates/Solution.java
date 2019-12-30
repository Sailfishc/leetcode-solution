package algorithm.RemoveDuplicates;

/**
 * @author sailfish
 * @create 2019-12-30-10:22 PM
 */
public class Solution {

//    Input: [2, 3, 3, 3, 6, 9, 9]
//    Output: 4
//    Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].

    public static int remove(int[] arr) {
        // TODO: Write your code here
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int left = 1, end = 1;
        while (++end < arr.length) {
            if (arr[left] <= arr[left - 1]) {
                arr[left] = arr[end];
            } else {
                left++;
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        System.out.println(remove(new int[]{2, 3, 3, 3, 6, 9, 9}));
        System.out.println(remove(new int[]{2, 2, 2, 11}));

    }
}
