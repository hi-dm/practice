//第189题
//https://leetcode-cn.com/problems/rotate-array
//给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
// 示例 1:
//
// 输入: [1,2,3,4,5,6,7] 和 k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右旋转 1 步: [7,1,2,3,4,5,6]
//向右旋转 2 步: [6,7,1,2,3,4,5]
//向右旋转 3 步: [5,6,7,1,2,3,4]
//
//
// 示例 2:
//
// 输入: [-1,-100,3,99] 和 k = 2
//输出: [3,99,-1,-100]
//解释:
//向右旋转 1 步: [99,-1,-100,3]
//向右旋转 2 步: [3,99,-1,-100]
//
// 说明:
//
//
// 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
// 要求使用空间复杂度为 O(1) 的 原地 算法。
//
// Related Topics 数组
// 👍 652 👎 0

package leetcode.editor.cn;

import com.oracle.javafx.jmx.json.impl.JSONMessages;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.HashSet;
import java.util.Set;

//java:旋转数组
public class Q189_RotateArray{
    public static void main(String[] args){
        System.out.println(3/5);
        System.out.println(3%5);

        Solution solution = new Q189_RotateArray().new Solution();
        solution.rotate(new int[]{-1,-100,3,99},2);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void rotate(int[] nums, int k) {
            if (nums.length==0){
                return;
            }
            k = k % nums.length;
            int count=0;
            for (int start = 0; count <nums.length ; start++) {
                int current=start;
                int prev=nums[start];
                do{
                    int next=getTargetIndex(current,k,nums.length);
                    int tmp=nums[next];
                    nums[next]=prev;
                    prev=tmp;
                    current=next;
                    count++;
                }while (start != current);
            }
        }

        private int getTargetIndex(int curr, int step,int length){
            return (curr+step)%length;
        }
    }

//leetcode submit region end(Prohibit modification and deletion)

}
