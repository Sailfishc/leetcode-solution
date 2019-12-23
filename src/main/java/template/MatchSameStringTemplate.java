package template;


import java.util.HashMap;
import java.util.Map;

/**
 * 比较两个字符串是否具有相同的字母和个数 模板（很多方法）
 */
public class MatchSameStringTemplate {

    public static boolean isSameString(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            map.put(str1.charAt(i), map.getOrDefault(str1.charAt(i), 0) + 1);
        }

        int matched = 0;
        for (int j = 0; j < str2.length(); j++) {
            if (map.containsKey(str2.charAt(j))) {
                map.put(str2.charAt(j), map.get(str2.charAt(j)) - 1);

                if (map.get(str2.charAt(j)) == 0) {
                    matched++;
                }
            }

            if (matched == map.size()) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(MatchSameStringTemplate.isSameString("abc", "abc"));
        System.out.println(MatchSameStringTemplate.isSameString("abc", "bac"));
        System.out.println(MatchSameStringTemplate.isSameString("abc", "dab"));
        System.out.println(MatchSameStringTemplate.isSameString("abc", "aa"));
    }
}
