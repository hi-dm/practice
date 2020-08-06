//第283题
//https://leetcode-cn.com/problems/move-zeroes
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 668 👎 0

package leetcode.editor.cn;
//java:移动零
public class Q283_MoveZeroes {
    public static void main(String[] args){
        Solution solution = new Q283_MoveZeroes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
       /* int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i]=0;
        }*/

        //法2
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==0){
                count++;
            }else if(count>0){ //!!!这一步条件要注意！！！
                nums[i-count]=nums[i];
                nums[i]=0;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 