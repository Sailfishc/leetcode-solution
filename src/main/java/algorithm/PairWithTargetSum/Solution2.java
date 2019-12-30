package algorithm.PairWithTargetSum;

import java.util.HashMap;
import java.util.Map;

import util.ArrayHelper;

/**
 * @author sailfish
 * @create 2019-12-30-10:09 PM
 */
public class Solution2 {

    public static int[] search(int[] arr, int targetSum) {
        // TODO: Write your code here
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int target = targetSum - arr[i];
            if (map.containsKey(target)) {
                return new int[]{map.get(target), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        ArrayHelper.printArr(search(new int[]{2, 5, 9, 11}, 11));
        ArrayHelper.printArr(search(new int[]{1, 2, 3, 4, 6}, 6));
    }
}
