package algorithm.L0206_ReverseLinkedList;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 *
 * @author sailfish
 * @create 2020-01-10-3:30 PM
 */
public class Solution {

    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            final ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }


    public ListNode reverse2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNodeHelper.printListNode(head);
        final ListNode listNode = reverse2(head.next);
        ListNodeHelper.printListNode(listNode);
        head.next.next = head;
        head.next = null;

        return listNode;
    }

    public static void main(String[] args) {
        final ListNode listNode = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4, 5});

        Solution solution = new Solution();
        final ListNode result = solution.reverse2(listNode);
        ListNodeHelper.printListNode(result);

    }
}
