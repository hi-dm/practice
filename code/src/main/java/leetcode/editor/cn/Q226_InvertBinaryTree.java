//第226题
//https://leetcode-cn.com/problems/invert-binary-tree
//翻转一棵二叉树。 
//
// 示例： 
//
// 输入： 
//
//      4
//   /   \
//  2     7
// / \   / \
//1   3 6   9 
//
// 输出： 
//
//      4
//   /   \
//  7     2
// / \   / \
//9   6 3   1 
//
// 备注: 
//这个问题是受到 Max Howell 的 原问题 启发的 ： 
//
// 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。 
// Related Topics 树 
// 👍 620 👎 0

package leetcode.editor.cn;
//java:翻转二叉树
public class Q226_InvertBinaryTree{
    public static void main(String[] args){
        Solution solution = new Q226_InvertBinaryTree().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 