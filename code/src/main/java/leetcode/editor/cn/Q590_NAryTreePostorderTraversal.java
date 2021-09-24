/*
//第590题
//https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal
//给定一个 N 叉树，返回其节点值的后序遍历。 
//
// 例如，给定一个 3叉树 : 
//
// 
//
// 
//
// 
//
// 返回其后序遍历: [5,6,3,2,4,1]. 
//
// 
//
// 说明: 递归法很简单，你可以使用迭代法完成此题吗? Related Topics 树 
// 👍 100 👎 0

package leetcode.editor.cn;

import java.util.LinkedList;
import java.util.List;

//java:N叉树的后序遍历
public class Q590_NAryTreePostorderTraversal{
    public static void main(String[] args){
        Solution solution = new Q590_NAryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorder(Node root) {
        LinkedList<Node> stack =new LinkedList<>();
        LinkedList<Integer> output =new LinkedList<>();
        if (root == null){
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            Node node =stack.pollLast();
            output.addFirst(node.val);
            for (Node item : node.children){
                if (item!=null){
                    stack.add(item);
                }
            }
        }
        return output;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 */
