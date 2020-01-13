package basic;

import org.junit.Test;

import util.ListNode;
import util.ListNodeHelper;

/**
 * @author sailfish
 * @create 2020-01-10-3:45 PM
 */
public class ListNodePointTest {


    @Test
    public void test_Node_next_operator() {
        final ListNode head = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4, 5});

        ListNode pre = head.next;
        ListNodeHelper.printListNode(pre);

        ListNode next = new ListNode(-1);
        ListNode curr = head.next;
        curr.next = next;
        next = curr;
        ListNodeHelper.printListNode(next);
    }
}
