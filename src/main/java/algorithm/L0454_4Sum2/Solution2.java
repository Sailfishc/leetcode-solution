package algorithm.L0454_4Sum2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-15-9:17 AM
 */
public class Solution2 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i : A) {
            for (int j : B) {
                if (map1.containsKey(i + j)) {
                    map1.put(i + j, map1.get(i + j) + 1);
                } else {
                    map1.put(i + j, 1);
                }
            }
        }
        int sum = 0;
        for (int i : C) {
            for (int j : D) {
                if (map1.containsKey(0 - i - j)) {
                    sum += map1.get(0 - i - j);
                }
            }
        }
        return sum;
    }

}
