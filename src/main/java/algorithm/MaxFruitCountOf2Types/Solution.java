package algorithm.MaxFruitCountOf2Types;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-19-11:43 AM
 */
public class Solution {

    public  int findLength(char[] arr) {
        // TODO: Write your code here
        Map<Character, Integer> map = new HashMap<>();
        int maxNum = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            final char key = arr[end];
            map.put(key, map.getOrDefault(key, 0) + 1);

            while (map.keySet().size() > 2) {
                map.put(arr[start], map.get(arr[start]) - 1);
                if (map.get(arr[start]) == 0) {
                    map.remove(arr[start]);
                }
                start++;
            }
            maxNum = Math.max(maxNum, end - start + 1);
        }
        return maxNum;
    }
}
