package CoderustHackingTheCodingInterview.LinkedList;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/lq2j
 *
 * @author sailfish
 * @create 2020-02-14-10:45 AM
 */
public class L01_ReserveSinglyLinkedList {


//    Given the pointer/reference to the head of a singly linked list, reverse it and return the pointer/reference to the head of reversed linked list.


//    If the linked list only contains 0 or 1 nodes, then the current list can be returned as it is. If there are two or more nodes, then the iterative solution starts with 2 pointers.
//
//    reversed: A pointer to already reversed linked list (initialized to head).
//    list_to_do: A pointer to the remaining list (initialized to head->next).
//    We then set the reversed->next to NULL. This becomes the last node in the reversed linked list. reversed will always point to the head of the newly reversed linked list.
//
//    At each iteration, the list_to_do pointer moves forward (until it reaches NULL). The current node becomes the head of the new reversed linked list and starts pointing to the previous head of the reversed linked list.
//
//    The loop terminates when list_to_do becomes NULL and the reversed pointer is pointing to the new head at the termination of the loop.

    public static ListNode reverse_list(
            ListNode head) {
        // no need to reverse if head is null
        // or there is only 1 node.
        if (head == null ||
                head.next == null) {
            return head;
        }
        ListNode reversed_list = head;
        ListNode list_to_do = head.next;
        reversed_list.next = null;
        while (list_to_do != null) {
            ListNode next = list_to_do.next;
            list_to_do.next = reversed_list;
            reversed_list = list_to_do;
            list_to_do = next;
        }
        return reversed_list;
    }

    public static ListNode reverse_list2(ListNode head) {
        // no need to reverse if head is null
        // or there is only 1 node.
        if (head == null ||
                head.next == null) {
            return head;
        }

        ListNode list_to_do = head.next;
        ListNode reversed_list = head;

        reversed_list.next = null;

        while (list_to_do != null) {
            ListNode temp = list_to_do;
            list_to_do = list_to_do.next;

            temp.next = reversed_list;
            reversed_list = temp;
        }

        return reversed_list;
    }

    public static ListNode reverse_recursive(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        final ListNode reversed_list = reverse_recursive(head.next);

        head.next.next = head;
        head.next = null;

        return reversed_list;
    }

    public static void main(String[] args) {
        final ListNode listNode = ListNodeHelper.genListNode(new Integer[]{7, 14, 21, 28});
//        final ListNode listNode1 = reverse_list(listNode);
        final ListNode listNode2 = reverse_recursive(listNode);
//        ListNodeHelper.printListNode(listNode1);
    }

}
