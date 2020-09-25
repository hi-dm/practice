//第49题
//https://leetcode-cn.com/problems/group-anagrams
//给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。 
//
// 示例: 
//
// 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
//输出:
//[
//  ["ate","eat","tea"],
//  ["nat","tan"],
//  ["bat"]
//] 
//
// 说明： 
//
// 
// 所有输入均为小写字母。 
// 不考虑答案输出的顺序。 
// 
// Related Topics 哈希表 字符串 
// 👍 471 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//java:字母异位词分组
public class Q49_GroupAnagrams{
    public static void main(String[] args){
        Solution solution = new Q49_GroupAnagrams().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash =new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char[] s_arr=strs[i].toCharArray();
            Arrays.sort(s_arr);
            String key=String.valueOf(s_arr);
            if (hash.containsKey(key)){
                hash.get(key).add(strs[i]);
            }else {
                ArrayList list= new ArrayList();
                list.add(strs[i]);
                hash.put(key ,list);
            }
        }
        return new ArrayList<List<String>>(hash.values());

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 