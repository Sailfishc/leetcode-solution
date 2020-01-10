package algorithm.L0206_ReverseLinkedList;

import util.ListNode;

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
}
