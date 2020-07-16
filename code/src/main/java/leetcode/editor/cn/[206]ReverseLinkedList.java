package leetcode.editor.cn;

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

//https://leetcode-cn.com/problems/reverse-linked-list
class ReverseLinkedList{
	public static void main(String[] args) {
		Solution solution = new ReverseLinkedList().new Solution();
		
	}
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
