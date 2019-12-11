package algorithm.L0202_HapplyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void isHappy() {
        Solution solution = new Solution();
        System.out.println(solution.isHappy(19));
        System.out.println(solution.isHappy(2));
    }
}