//将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = l1;
        while (l2 != null) {
            if (p.val <= l2.val && p.next.val > l2.val) {
                ListNode temp = new ListNode(l2.val);
                temp.next = p.next;
                p.next = temp;
                p = p.next;
                l2 = l2.next;
            }
        }
        return l1;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
