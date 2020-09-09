//第84题
//https://leetcode-cn.com/problems/largest-rectangle-in-histogram
//给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。 
//
// 求在该柱状图中，能够勾勒出来的矩形的最大面积。 
//
// 
//
// 
//
// 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。 
//
// 
//
// 
//
// 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。 
//
// 
//
// 示例: 
//
// 输入: [2,1,5,6,2,3]
//输出: 10 
// Related Topics 栈 数组 
// 👍 856 👎 0

package leetcode.editor.cn.arraylink;

//java:柱状图中最大的矩形
public class Q84_LargestRectangleInHistogram {
    public static void main(String[] args) {
        Solution solution = new Q84_LargestRectangleInHistogram().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int max = 0;
            int left = 0;

            if (heights.length < 1) {
                return 0;
            }
            if (heights.length == 1) {
                return heights[0];
            }
            int right = heights.length - 1;

            while (left < right) {
                max = Math.max(max, Math.min(heights[right], heights[left]) * (right - left + 1));
                if (heights[right] < heights[left]) {
                    right--;
                } else {
                    left++;
                }
            }
            return max;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
 