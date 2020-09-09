//第94题
//https://leetcode-cn.com/problems/binary-tree-inorder-traversal
//给定一个二叉树，返回它的中序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 哈希表 
// 👍 664 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:二叉树的中序遍历
public class Q94_BinaryTreeInorderTraversal{
    public static void main(String[] args){
        Solution solution = new Q94_BinaryTreeInorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
   public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>  res=new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode root,List<Integer> list){
        if (root==null){
            return;
        }
        if (root.left!=null){
            helper(root.left,list);
        }
        list.add(root.val);
        if (root.right!=null){
            helper(root.right,list);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 