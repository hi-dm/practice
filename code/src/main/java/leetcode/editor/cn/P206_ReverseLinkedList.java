//第206题
//https://leetcode-cn.com/problems/reverse-linked-list
//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表 
// 👍 1140 👎 0

package leetcode.editor.cn;
//java:反转链表
public class P206_ReverseLinkedList{
    public static void main(String[] args){
        Solution solution = new P206_ReverseLinkedList().new Solution();
    }
    /**
     * Definition for singly-linked list.
     *  */
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {

    public ListNode reverseList(ListNode head) {
    ListNode current=head;
    ListNode pre=null;
    while (current!=null){
        ListNode temp=current.next;
        current.next=pre;
        pre=current;
        current=temp;
    }
    return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 