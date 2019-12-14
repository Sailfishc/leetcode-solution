package algorithm._L0015_3Sum;

import org.junit.Test;

import java.util.List;

/**
 * @author sailfish
 * @create 2019-12-13-11:03 PM
 */
public class SolutionTest {

    @Test
    public void threeSum() {

        Solution solution = new Solution();
        int[] arrs = {-1, 0, 1, 2, -1, -4};
        final List<List<Integer>> lists = solution.threeSum(arrs);
        for (List<Integer> list : lists) {
            final Integer[] nums = list.toArray(new Integer[0]);
            for (Integer num : nums) {
                System.out.println(num);
            }
        }
    }
}