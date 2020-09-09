//第143题
//https://leetcode-cn.com/problems/reorder-list
//给定一个单链表 L：L0→L1→…→Ln-1→Ln ， 
//将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→… 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 示例 1: 
//
// 给定链表 1->2->3->4, 重新排列为 1->4->2->3. 
//
// 示例 2: 
//
// 给定链表 1->2->3->4->5, 重新排列为 1->5->2->4->3. 
// Related Topics 链表 
// 👍 268 👎 0

package leetcode.editor.cn.arraylink;
//java:重排链表
public class Q143_ReorderList {
    public static void main(String[] args){
        Solution solution = new Q143_ReorderList().new Solution();
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
    public void reorderList(ListNode head) {
        if(head==null){
            return;
        }

        ListNode mid=findMid(head);
        ListNode right=mid.next;
        ListNode left=head;

        mid.next=null;
        right=revers(right);
        merge(left,right);
    }

    private ListNode revers(ListNode node){
        if (node==null || node.next==null){
            return  node;
        }

        ListNode pre=null;
        ListNode current=node;
        while (current!=null ){
            ListNode tmp=current.next;
            current.next=pre    ;
            pre=current;
            current=tmp;
        }
        return pre;
    }

    private ListNode merge(ListNode l1,ListNode l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode f1=l1;
        ListNode f2=l2;
        ListNode dummy=new ListNode();
        dummy.next=f1;
        while (f1!=null && f2!=null ){
             ListNode f1Next=f1.next;
             f1.next=f2;
             ListNode f2Next=f2.next;
             if (f1Next!=null){
                 f2.next=f1Next;
             }
             f1=f1Next;
             f2=f2Next;
        }

        return dummy.next;
    }

    private ListNode findMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }



   /* private void merge(ListNode left, ListNode right) {
       while (right!=null){
        ListNode tmp=right.next;
        right.next=left.next;
        left.next=right;
        left=right.next;
        right=tmp;
       }
    }

    private ListNode revers(ListNode right) {
        ListNode pre=null;
        ListNode current=right;

        while (current!=null){
            ListNode tmp=current.next;
            current.next=pre;
            pre=current;
            current=tmp;
        }
        return pre;
    }

    private ListNode findMid(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }*/


}
//leetcode submit region end(Prohibit modification and deletion)

}
 