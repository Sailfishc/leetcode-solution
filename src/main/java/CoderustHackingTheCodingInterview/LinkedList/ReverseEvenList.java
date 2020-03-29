package CoderustHackingTheCodingInterview.LinkedList;

import util.ListNode;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/lOxKj
 *
 * @author sailfish
 * @create 2020-03-29-8:39 PM
 */
public class ReverseEvenList {


    /**
     * 错误解法
     * @param head
     * @return
     */
    public static ListNode reverseEvenNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int count = 2;
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null && cur.next.next != null) {
            if (count % 2 == 0 && count % 4 != 0) {
                ListNode firstNode = cur;
                ListNode nextNode = cur.next;
                ListNode secondNode = cur.next.next;
                firstNode.next = secondNode.next;
                nextNode.next = cur;
                pre.next = secondNode;
                secondNode.next = nextNode;
            }
            pre = pre.next;
            cur = cur.next;
            count++;
        }
        return head;
    }
}
