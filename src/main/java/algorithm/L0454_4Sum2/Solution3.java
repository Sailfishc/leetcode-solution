package algorithm.L0454_4Sum2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-15-9:17 AM
 */
public class Solution3 {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i : A) {
            for (int j : B) {
                int sum = i + j;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        for (int i : C) {
            for (int j : D) {
                int target = -i - j;
                res += map.getOrDefault(target, 0);
            }
        }
        return res;
    }

}
