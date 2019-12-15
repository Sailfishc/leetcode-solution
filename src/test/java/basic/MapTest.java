package basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sailfish
 * @create 2019-12-15-10:33 AM
 */
public class MapTest {


    @Test
    public void testSameValueStringKey() {
        String a = "sailfish";
        String b = "sailfish";

        Map<String, String> map = new HashMap<>();
        map.put(a, "a");
        map.put(b, "b");

        Assert.assertEquals(1, map.size());
    }


    @Test
    public void testSameValueNewStringKey() {
        char[] charsA = {'a', 'b'};
        char[] charsB = {'a', 'b'};
        String a = new String(charsA);
        String b = new String(charsB);

        Map<String, String> map = new HashMap<>();
        map.put(a, "a");
        map.put(b, "b");

        Assert.assertEquals(1, map.size());
    }
}
