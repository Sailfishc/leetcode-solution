package algorithm.L0023_MergeSortedKLists;

import util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 成易
 * @version V1.0
 * @Title:
 * @Package algorithm.L0023_MergeSortedKLists
 * @Description:
 * @date 2020/6/15 11:15 下午
 */
public class Solution {


    /*
    Input:
        [
          1->4->5,
          1->3->4,
          2->6
        ]
        Output: 1->1->2->3->4->4->5->6
     */

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy.next;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (ListNode list : lists) {
            while (list != null) {
                queue.add(list.val);
                list = list.next;
            }
        }

        while (queue.peek() != null) {
            cur = new ListNode(queue.poll());
            cur = cur.next;
        }
        return dummy.next;
    }
}
