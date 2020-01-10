package algorithm.L0206_ReverseLinkedList;

import org.junit.Test;

import util.ListNode;
import util.ListNodeHelper;

import static org.junit.Assert.*;

/**
 * @author sailfish
 * @create 2020-01-10-3:34 PM
 */
public class SolutionTest {

    @Test
    public void reverse() {
        final ListNode head = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4, 5});
        ListNodeHelper.printListNode(new Solution().reverse(head));
    }
}