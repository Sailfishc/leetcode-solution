package CoderustHackingTheCodingInterview.LinkedList;

import java.util.HashSet;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/lYZoV
 *
 * @author sailfish
 * @create 2020-02-18-2:08 PM
 */
public class L02_RemoveDuplicatesFromALinkedList {


    public static ListNode remove_duplicates(ListNode head)
    {
        if (head == null) {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode curNode = head;
        set.add(curNode.val);
        while (curNode.next != null) {
            if (set.contains(curNode.next.val)) {
                // Duplicate node found. Let's remove it from the list.
                curNode.next = curNode.next.next;
            } else {
                set.add(curNode.next.val);
                curNode = curNode.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        final ListNode listNode = ListNodeHelper.genListNode(new Integer[]{7, 14, 28, 28, 14, 21});
        ListNodeHelper.printListNode(listNode);
        final ListNode result = remove_duplicates(listNode);
        ListNodeHelper.printListNode(result);
    }
}
