package CoderustHackingTheCodingInterview.LinkedList;

import util.ListNode;
import util.ListNodeHelper;

/**
 * https://www.educative.io/courses/coderust-hacking-the-coding-interview/nvO5
 *
 * @author sailfish
 * @create 2020-02-22-2:59 PM
 */
public class L05_IntersectionPointofTwoLists {

//    Given the head nodes of two linked lists that may or may not intersect, find out if they intersect and return the point of intersection. Return null otherwise.


    public static ListNode intersect(
            ListNode head1,
            ListNode head2) {
        int head1Length = getListNodeLength(head1);
        int head2Length = getListNodeLength(head2);
        System.out.println("Head1 Length = " + head1Length);

        int moveLen = head1Length - head2Length;
        if (moveLen > 0) {
            while (--moveLen > 0) {
                head1 = head1.next;
            }
        } else {
            while (++moveLen < 0) {
                head2 = head2.next;
            }
        }

        // 对比
        while (head1 != null && head2 != null) {
            if (head1.equals(head2)) {
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }



    private static int getListNodeLength(ListNode head) {
        int count = 0;
        while (head != null) {
            ListNode next = head.next;
            count++;
            head = next;
        }
        return count;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4});
        ListNode listNode2 = ListNodeHelper.genListNode(new Integer[]{1, 2, 3, 4});
        intersect(listNode, listNode2);

    }
}

