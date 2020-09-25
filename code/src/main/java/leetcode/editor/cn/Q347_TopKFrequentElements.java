//第347题
//https://leetcode-cn.com/problems/top-k-frequent-elements
//给定一个非空的整数数组，返回其中出现频率前 k 高的元素。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [1,1,1,2,2,3], k = 2
//输出: [1,2]
// 
//
// 示例 2: 
//
// 输入: nums = [1], k = 1
//输出: [1] 
//
// 
//
// 提示： 
//
// 
// 你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。 
// 你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。 
// 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。 
// 你可以按任意顺序返回答案。 
// 
// Related Topics 堆 哈希表 
// 👍 525 👎 0

package leetcode.editor.cn;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//java:前 K 个高频元素
public class Q347_TopKFrequentElements{
    public static void main(String[] args){
        Solution solution = new Q347_TopKFrequentElements().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> occurrences=new HashMap<Integer,Integer>();
        for (int num:nums){
            occurrences.put(num,occurrences.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });


        for (Map.Entry<Integer,Integer> entry : occurrences.entrySet()){
            int num = entry.getKey(),count =entry.getValue();
            if (queue.size() ==k){
                if (queue.peek()[1]<count){
                    queue.poll();
                    queue.offer(new int[]{num,count});
                }
            }else {
                queue.offer(new int[]{num,count});
            }
        }

        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i]=queue.poll()[0];
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
 