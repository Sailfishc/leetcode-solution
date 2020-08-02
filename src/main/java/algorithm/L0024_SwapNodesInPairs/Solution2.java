package algorithm.L0024_SwapNodesInPairs;

import util.ListNode;
import util.ListNodeHelper;

/**
 * @author sailfish
 * @create 2020-08-02-7:00 下午
 */
public class Solution2 {

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        ListNodeHelper.printListNode(head);
        head.next = swapPairs(next.next);
        ListNodeHelper.printListNode(head);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ListNode listNode = solution2.swapPairs(ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4}));
        ListNodeHelper.printListNode(listNode);

    }
}
