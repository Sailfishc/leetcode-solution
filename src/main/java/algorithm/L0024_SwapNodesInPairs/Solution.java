package algorithm.L0024_SwapNodesInPairs;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/description/?utm_source=LCUS&utm_medium=ip_redirect_q_uns&utm_campaign=transfer2china
 *
 * @author sailfish
 * @create 2019-10-23-18:57
 */
public class Solution {

//    Given a linked list, swap every two adjacent nodes and return its head.
//
//    You may not modify the values in the list's nodes, only nodes itself may be changed.
//
//             
//
//    Example:
//
//    Given 1->2->3->4, you should return the list as 2->1->4->3.


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode tmp = pre;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode start = tmp.next;
            ListNode end = tmp.next.next;
            tmp.next = end;
            start.next = end.next;
            end.next = start;
            tmp = start;
        }
        return pre.next;
    }


    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode firstNode = head;
        ListNode secondNode = head.next;

        ListNodeHelper.printListNode(head);
        final ListNode listNode = swapPairs2(secondNode.next);
        ListNodeHelper.printListNode(listNode);
        firstNode.next = listNode;
        secondNode.next = firstNode;

        return secondNode;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        final ListNode head = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        final ListNode listNode = solution.swapPairs2(head);
        ListNodeHelper.printListNode(listNode);

    }

}
