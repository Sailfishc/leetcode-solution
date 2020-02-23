package quickBrain;

import util.ListNode;
import util.ListNodeHelper;

/**
 * @author sailfish
 * @create 2020-02-23-6:22 PM
 */
public class ReverseLinkedList {


    public static ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4, 5});
        ListNode result = reverse(listNode);
        ListNodeHelper.printListNode(result);
    }
}
