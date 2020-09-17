//第589题
//https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal
//给定一个 N 叉树，返回其节点值的前序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其前序遍历: [1,3,5,6,2,4]。 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 101 👎 0

package leetcode.editor.cn;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//java:N叉树的前序遍历
public class Q589_NAryTreePreorderTraversal{
    public static void main(String[] args){
        Solution solution = new Q589_NAryTreePreorderTraversal().new Solution();
    }

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children) {
                stack.add(item);
            }
        }
        return output;

    }
     /*  private List<Integer> res;
        public List<Integer> preorder(Node root) {
            res = new LinkedList<>();
            dfs(root);
            return res;
        }
        private void dfs(Node root) {
            if(root == null)    return;
            res.add(root.val);
            for(Node child : root.children)
                dfs(child);
        }*/
}
//leetcode submit region end(Prohibit modification and deletion)

}
 