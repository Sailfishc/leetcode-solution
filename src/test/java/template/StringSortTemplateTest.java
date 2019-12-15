package template;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-15-11:42 AM
 */
public class StringSortTemplateTest {

    @Test
    public void sortTemplate1() {
        String s = "bac";
        StringSortTemplate template = new StringSortTemplate();
        Assert.assertEquals("abc", template.sortTemplate2(s));
    }

    @Test
    public void sortTemplate2() {
        String s = "bac";
        StringSortTemplate template = new StringSortTemplate();
        Assert.assertEquals("abc", template.sortTemplate2(s));
    }
}