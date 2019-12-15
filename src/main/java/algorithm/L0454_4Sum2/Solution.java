package algorithm.L0454_4Sum2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-15-9:17 AM
 */
public class Solution {

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
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i : C) {
            for (int j : D) {
                if (map2.containsKey(i + j)) {
                    map2.put(i + j, map2.get(i + j) + 1);
                } else {
                    map2.put(i + j, 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(-entry.getKey())) {
                sum += entry.getValue() * map2.get(-entry.getKey());
            }
        }
        return sum;
    }

}
