package algorithm.L0049_GroupAnagrams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-15-10:13 AM
 */
public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            final char[] chars = s.toCharArray();
            Arrays.sort(chars);
            final String sortStr = new String(chars);
            if (map.containsKey(sortStr)) {
                final List<String> strings = map.get(sortStr);
                strings.add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
//                resList.add(list);
                map.put(sortStr, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
