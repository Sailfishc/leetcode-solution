package algorithm;

import util.ListNode;
import util.ListNodeHelper;

/**
 * @author 成易
 * @version V1.0
 * @Title:
 * @Package algorithm
 * @Description:
 * @date 2020/6/8 9:26 上午
 */
public class L0002_AddTwoList {


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        int t = 0;
        ListNode cur = dummy;
        ListNode p = l1;
        ListNode q = l2;
        while(p != null || q != null){
            int pValue = p != null ? p.val : 0;
            int qValue = q != null ? q.val : 0;
            int sum = pValue + qValue + t;
            t = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (q != null) {
                q = q.next;
            }
            if (p != null) {
                p = p.next;
            }
        }
        if (t != 0) {
            cur.next = new ListNode(t);
        }
        return dummy.next;
    }


    public static void main(String[] args) {
        L0002_AddTwoList solution = new L0002_AddTwoList();
        final ListNode listNode = solution.addTwoNumbers(ListNodeHelper.genListNode(new Integer[]{2, 4, 3}), ListNodeHelper.genListNode(new Integer[]{5, 6, 4}));
        ListNodeHelper.printListNode(listNode);

        // 第二种Case
        final ListNode listNode2 = solution.addTwoNumbers(ListNodeHelper.genListNode(new Integer[]{0, 1}), ListNodeHelper.genListNode(new Integer[]{0, 1, 2}));
        ListNodeHelper.printListNode(listNode2);

    }
}
