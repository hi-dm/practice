//第21题
//https://leetcode-cn.com/problems/merge-two-sorted-lists
//将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
//
// 
//
// 示例： 
//
// 输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4
// 
// Related Topics 链表 
// 👍 1201 👎 0

package leetcode.editor.cn;

//java:合并两个有序链表
public class Q21_MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new Q21_MergeTwoSortedLists().new Solution();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode pre = new ListNode(0);
            ListNode dummy = pre;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    pre.next = l1;
                    l1 = l1.next;
                } else {
                    pre.next = l2;
                    l2 = l2.next;
                }
                pre=pre.next;
            }
            pre.next=l1==null?l2:l1;
            return dummy.next;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
 