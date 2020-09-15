//第83题
//https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表 
// 👍 390 👎 0

package leetcode.editor.cn;

import leetcode.editor.cn.arraylink.Q24_SwapNodesInPairs;

//java:删除排序链表中的重复元素
public class Q83_RemoveDuplicatesFromSortedList{

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static void main(String[] args){
        ListNode listNode1=new ListNode(1);
        ListNode listNode2=new ListNode(1);
        ListNode listNode3=new ListNode(1);
        listNode1.next=listNode2;
        listNode2.next=listNode3;

        Solution solution = new Q83_RemoveDuplicatesFromSortedList().new Solution();
        solution.deleteDuplicates(listNode1);
    }
    //leetcode submit region begin(Prohibit modification and deletion)


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head== null || head.next==null){
            return head;
        }

        ListNode current=head;
        while (current!=null && current.next!=null){
            if (current.val==current.next.val){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 