package algorithm.L0904FruitIntoBaskets;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-19-11:53 AM
 */
public class Solution {

    public int totalFruit(int[] tree) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxNum = 0;
        int start = 0;
        for (int end = 0; end < tree.length; end++) {
            final int key = tree[end];
            map.put(key, map.getOrDefault(key, 0) + 1);

            while (map.keySet().size() > 2) {
                map.put(tree[start], map.get(tree[start]) - 1);
                if (map.get(tree[start]) == 0) {
                    map.remove(tree[start]);
                }
                start++;
            }
            maxNum = Math.max(maxNum, end - start + 1);
        }
        return maxNum;
    }
}
