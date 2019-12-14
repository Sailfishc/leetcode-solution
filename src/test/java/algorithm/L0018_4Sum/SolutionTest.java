package algorithm.L0018_4Sum;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-14-11:24 AM
 */
public class SolutionTest {

    @Test
    public void fourSum() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        Solution solution = new Solution();
        final List<List<Integer>> resList = solution.fourSum(nums, 0);
        for (List<Integer> list : resList) {
            for (Integer integer : list) {
                System.out.print(integer + "  ");
            }
            System.out.println();
        }
    }


    @Test
    public void fourSumToFistCaseError() {
        int[] nums = {0, 0, 0, 0};
        Solution solution = new Solution();
        final List<List<Integer>> resList = solution.fourSum(nums, 0);
        for (List<Integer> list : resList) {
            for (Integer integer : list) {
                System.out.print(integer + "  ");
            }
            System.out.println();
        }
    }
}