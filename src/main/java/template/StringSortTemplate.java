package template;

import java.util.Arrays;

/**
 * 字符串排序
 *
 * @author sailfish
 * @create 2019-12-15-11:36 AM
 */
public class StringSortTemplate {

    /**
     * 排序模板1
     * @param s
     * @return
     */
    public String sortTemplate1(String s) {
        final char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    /**
     * 特定的小写字母
     *
     * @param s
     * @return
     */
    public String sortTemplate2(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        String res = "";
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                res += (char) (i + 'a');
            }
        }
        return res;
    }
}
