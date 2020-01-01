package basic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import util.PrintUtils;

/**
 * @author sailfish
 * @create 2020-01-01-11:00 AM
 */
public class ListTest {


    @Test
    public void testListAddMethod() {
        List<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(0, 2);

        PrintUtils.println(list);
    }
}
