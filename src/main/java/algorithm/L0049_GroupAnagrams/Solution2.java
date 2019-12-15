package algorithm.L0049_GroupAnagrams;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sailfish
 * @create 2019-12-15-10:13 AM
 */
public class Solution2 {

    public List<List<String>> groupAnagrams(String[] strs) {
        // 不适用排序：使用26位数组
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            String s = "";
            for (int i = 0; i < count.length; i++) {
                s += String.valueOf(count[i]) + String.valueOf((char) (i + 'a'));
            }

            if (map.containsKey(s)) {
                final List<String> strings = map.get(s);
                strings.add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(s, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
