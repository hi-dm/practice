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
public class Q21_MergeTwoSortedLists{
    public static void main(String[] args){
        Solution solution = new Q21_MergeTwoSortedLists().new Solution();
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null ){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode curr1=l1;
        ListNode curr2=l2;
        ListNode pre=null;

        ListNode dummy=pre;
        while (curr1!=null   && curr2!=null){
            if (curr1.val>=curr2.val){
                ListNode tmp=curr2.next;
                curr2.next=pre ;
                pre=curr2;
                curr2=tmp;
            }else {
                ListNode tmp=curr1.next;
                curr1.next=pre;
                pre=curr1;
                curr1=tmp;
            }
        }

        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 