//第142题
//https://leetcode-cn.com/problems/linked-list-cycle-ii
//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。 
//
// 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。 
//
// 说明：不允许修改给定的链表。 
//
// 
//
// 示例 1： 
//
// 输入：head = [3,2,0,-4], pos = 1
//输出：tail connects to node index 1
//解释：链表中有一个环，其尾部连接到第二个节点。
// 
//
// 
//
// 示例 2： 
//
// 输入：head = [1,2], pos = 0
//输出：tail connects to node index 0
//解释：链表中有一个环，其尾部连接到第一个节点。
// 
//
// 
//
// 示例 3： 
//
// 输入：head = [1], pos = -1
//输出：no cycle
//解释：链表中没有环。
// 
//
// 
//
// 
//
// 进阶： 
//你是否可以不用额外空间解决此题？ 
// Related Topics 链表 双指针 
// 👍 568 👎 0

package leetcode.editor.cn.arraylink;

import java.util.HashSet;

//java:环形链表 II
public class Q142_LinkedListCycleIi {
    public static void main(String[] args){
        Solution solution = new Q142_LinkedListCycleIi().new Solution();
    }
    /**
     * Definition for singly-linked list.
     * */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    //leetcode submit region begin(Prohibit modification and deletion)


public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode>  visited=new HashSet<>();
        ListNode current=head;
        while (current!=null && current.next!=null){
          if ( visited.contains(current)){
              return current;
          }
          visited.add(current);
          current=current.next;
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 