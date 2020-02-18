package CoderustHackingTheCodingInterview.LinkedList;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/mBNG
 *
 * @author sailfish
 * @create 2020-02-18-3:09 PM
 */
public class L003_DeleteNodeWithAGivenKey {

    public static ListNode delete_node(ListNode head, int key)
    {
        if (head == null) {
            return head;
        }
        ListNode dummyNode = new ListNode(1);
        dummyNode.next = head;
        ListNode curNode = dummyNode;
        while (curNode.next != null) {
            if (curNode.next.val == key) {
                curNode.next = curNode.next.next;
            } else {
                curNode = curNode.next;
            }
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
//        final ListNode listNode = ListNodeHelper.genListNode(new Integer[]{7, 14, 21, 28, 35, 42});
        final ListNode listNode = ListNodeHelper.genListNode(new Integer[]{4, 6, 20});
        ListNodeHelper.printListNode(listNode);
        final ListNode result = delete_node(listNode, 4);
        ListNodeHelper.printListNode(result);
    }
}
