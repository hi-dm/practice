//第144题
//https://leetcode-cn.com/problems/binary-tree-preorder-traversal
//给定一个二叉树，返回它的 前序 遍历。 
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
//输出: [1,2,3]
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 367 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:二叉树的前序遍历
public class Q144_BinaryTreePreorderTraversal{
    public static void main(String[] args){
        Solution solution = new Q144_BinaryTreePreorderTraversal().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list= new ArrayList<>();
        inorder(root,list);
       return list;
    }

    private void inorder(TreeNode treeNode,List<Integer> res){
         if (null==treeNode){
             return;
         }
         res.add(treeNode.val);
         inorder(treeNode.left,res);
         inorder(treeNode.right,res);
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
 