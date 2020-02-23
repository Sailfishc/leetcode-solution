package CoderustHackingTheCodingInterview.LinkedList;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/k5MBN
 *
 * @author sailfish
 * @create 2020-02-23-11:03 AM
 */
public class L07_SwapNthNodewithHead {

//    Given the head of a singly linked list and 'N', swap the head with the Nth node. Return the head of the new linked list.


    public static ListNode swap_nth_node(ListNode head, int n) {
        if (head == null || n < 1) {
            return head;
        }
        ListNode cur = head;

        while (--n > 1) {
            cur = cur.next;
        }

        ListNode targetNode = cur.next;
        ListNode headNext = head.next;
        head.next = targetNode.next;
        cur.next = head;
        targetNode.next = headNext;

        return targetNode;
    }


    public static void main(String[] args) {
        ListNode listNode = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4, 5});
        ListNode nth_from_last = swap_nth_node(listNode, 3);
        ListNodeHelper.printListNode(nth_from_last);
    }

}
