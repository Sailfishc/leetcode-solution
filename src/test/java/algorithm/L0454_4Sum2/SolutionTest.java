package algorithm.L0454_4Sum2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2019-12-15-9:43 AM
 */
public class SolutionTest {

    @Test
    public void fourSumCount() {
        Solution solution = new Solution();
        int[] A = {1, 2};
        int[] B = {-2,-1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        final int sum = solution.fourSumCount(A, B, C, D);
        System.out.println("total sum=" + sum);
    }


    @Test
    public void fourSumCountToSolution2() {
        Solution2 solution = new Solution2();
        int[] A = {1, 2};
        int[] B = {-2,-1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        final int sum = solution.fourSumCount(A, B, C, D);
        System.out.println("total sum=" + sum);
    }
}