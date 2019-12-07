package algorithm.L0075_SortColors;

import org.junit.Test;
import util.ArrayHelper;


public class SolutionTest {

    @Test
    public void sortColors() {

        Solution solution = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        ArrayHelper.printArr(nums);
    }
}
