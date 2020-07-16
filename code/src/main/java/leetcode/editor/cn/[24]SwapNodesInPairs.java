package leetcode.editor.cn;

//给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 
//
// 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。 
//
// 
//
// 示例: 
//
// 给定 1->2->3->4, 你应该返回 2->1->4->3.
// 
// Related Topics 链表

import java.util.List;

//https://leetcode-cn.com/problems/swap-nodes-in-pairs
class SwapNodesInPairs{
	public static void main(String[] args) {
		Solution solution = new SwapNodesInPairs().new Solution();
		
	}

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
//leetcode submit region begin(Prohibit modification and deletion)



class Solution {
    public ListNode swapPairs(ListNode head) {

		ListNode pre=new ListNode(0);
		pre.next=head;
		ListNode current=pre;
		while (current.next!=null && current.next.next!=null){
			ListNode start=current.next;
			ListNode end=current.next.next;
			current.next=end;
			start.next=end.next;
			end.next=start;
			current=start;
		}
		return pre.next.next.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
