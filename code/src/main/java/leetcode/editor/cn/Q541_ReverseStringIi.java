//第541题
//https://leetcode-cn.com/problems/reverse-string-ii
//给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。 
//
// 
// 如果剩余字符少于 k 个，则将剩余字符全部反转。 
// 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。 
// 
//
// 
//
// 示例: 
//
// 输入: s = "abcdefg", k = 2
//输出: "bacdfeg"
// 
//
// 
//
// 提示： 
//
// 
// 该字符串只包含小写英文字母。 
// 给定字符串的长度和 k 在 [1, 10000] 范围内。 
// 
// Related Topics 字符串 
// 👍 91 👎 0

package leetcode.editor.cn;
//java:反转字符串 II
public class Q541_ReverseStringIi{
    public static void main(String[] args){
        Solution solution = new Q541_ReverseStringIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int n=ch.length;

        for (int i = 0; i < n; i+=2*k) {
            int left =i;
            int right =(i+k-1<n)?i+k-1:n-1;
            while (left<=right){
                char temp =ch[left];
                ch[left] =ch[right];
                ch[right]= temp;
                left++;
                right--;
            }
        }
        String str = new String(ch);
        return str;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 