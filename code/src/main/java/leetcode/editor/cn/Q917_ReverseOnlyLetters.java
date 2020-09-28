//第917题
//https://leetcode-cn.com/problems/reverse-only-letters
//给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。 
//
// 
//
// 
// 
//
// 示例 1： 
//
// 输入："ab-cd"
//输出："dc-ba"
// 
//
// 示例 2： 
//
// 输入："a-bC-dEf-ghIj"
//输出："j-Ih-gfE-dCba"
// 
//
// 示例 3： 
//
// 输入："Test1ng-Leet=code-Q!"
//输出："Qedo1ct-eeLg=ntse-T!"
// 
//
// 
//
// 提示： 
//
// 
// S.length <= 100 
// 33 <= S[i].ASCIIcode <= 122 
// S 中不包含 \ or " 
// 
// Related Topics 字符串 
// 👍 61 👎 0

package leetcode.editor.cn;

import java.util.Stack;

//java:仅仅反转字母
public class Q917_ReverseOnlyLetters{
    public static void main(String[] args){
        Solution solution = new Q917_ReverseOnlyLetters().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseOnlyLetters(String S) {

        Stack<Character> letters = new Stack();
        for (char c: S.toCharArray()){
            if (Character.isLetter(c)){
                letters.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (char c: S.toCharArray()){
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else{
                ans.append(c);
            }
        }
        return ans.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 