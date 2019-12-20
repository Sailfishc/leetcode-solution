package algorithm.MaxFruitCountOf2Types;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-19-11:47 AM
 */
public class SolutionTest {

    @Test
    public void findLength() {
        char[] Fruit = {'A', 'B', 'C', 'B', 'B', 'C'};
        Solution solution = new Solution();
        Assert.assertEquals(5, solution.findLength(Fruit));
    }


    @Test
    public void findLength2() {
        char[] Fruit = {'A', 'B', 'C', 'A', 'C'};
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.findLength(Fruit));
    }
}