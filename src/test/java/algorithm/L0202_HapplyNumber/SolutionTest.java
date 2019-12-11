package algorithm.L0202_HapplyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isHappy() {
        Solution2 solution = new Solution2();
        System.out.println(solution.isHappy(19));
        System.out.println(solution.isHappy(2));

    }
}