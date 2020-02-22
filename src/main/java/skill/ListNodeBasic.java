package skill;

import util.ListNode;
import util.ListNodeHelper;

/**
 * @author sailfish
 * @create 2020-02-22-9:41 AM
 */
public class ListNodeBasic {


    public ListNode deleteNode(ListNode head) {
        // delete head.next node
        head.next = head.next.next;
        return head;
    }


    public static ListNode insertNodeToIndex(ListNode node) {
        ListNode insertNode = new ListNode(300);
        final ListNode next = node.next;
        node.next = insertNode;
        insertNode.next = next;
        return node;
    }


    public static void main(String[] args) {
        final ListNode listNode = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4});
        final ListNode listNode1 = insertNodeToIndex(listNode);
        ListNodeHelper.printListNode(listNode1);
    }
}
