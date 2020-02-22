package CoderustHackingTheCodingInterview.LinkedList;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/kZDkv
 *
 * @author sailfish
 * @create 2020-02-19-6:09 PM
 */
public class L04_InsertionSortALinkedList {

    public static ListNode insertion_sort(ListNode head) {
        ListNode sortNode = null;
        while (head != null) {
            ListNode next = head.next;

            sortNode = sort(sortNode, head);

            head = next;
        }
        return sortNode;
    }

    private static ListNode sort(ListNode sortNode, ListNode head) {
        if (head == null) {
            return sortNode;
        }

        if (sortNode == null || head.val < sortNode.val) {
            head.next = sortNode;
            return head;
        }

        ListNode cur = sortNode;

        while (cur.next != null && cur.next.val < head.val) {
            cur = cur.next;
        }

        head.next = cur.next;
        cur.next = head;

        return sortNode;
    }


    public static void main(String[] args) {
        ListNode listNode = ListNodeHelper.genListNode(new Integer[]{29, 23, 82, 11});
        ListNode listNode1 = insertion_sort(listNode);
        ListNodeHelper.printListNode(listNode1);
    }

}
