package CoderustHackingTheCodingInterview.LinkedList;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/mryR
 *
 * @author sailfish
 * @create 2020-02-23-10:55 AM
 */
public class L06_NthfromLastNode {

//    Given a singly linked list, return the nth from last node. Return null if 'n' is out-of-bounds.


    public static ListNode find_nth_from_last(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;

        while (n-- > 0) {
            if (tail == null) {
                return null;
            }
            tail = tail.next;
        }

        while (tail != null) {
            head = head.next;
            tail = tail.next;
        }

        return head;
    }


    public static void main(String[] args) {
        ListNode listNode = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4, 5});
        ListNode nth_from_last = find_nth_from_last(listNode, 3);
        ListNodeHelper.printListNode(nth_from_last);
    }
}
