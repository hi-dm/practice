package leetcode.editor.cn;

//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 
//
// 示例： 
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
// Related Topics 数组 双指针

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode-cn.com/problems/3sum
class ThreeSum{
	public static void main(String[] args) {
		Solution solution = new ThreeSum().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		int left=0;
		int mid=1;
		int right=2;
		List<List<Integer>> lists =new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length-2; i++) {
			left=i;
			mid=i+1;
			right=nums.length-1;

			if (nums[i]>0){break;}
			if (nums[right]<0){break;}
			//去重 防止左侧的重复 [1,1,-2,2]
			if(i>0 && nums[i-1]==nums[i]){continue;}
			while (mid<right){
				if (nums[left]+nums[mid]+nums[right]==0){
					List<Integer> list=new ArrayList<Integer>();
					list.add(nums[left]);
					list.add(nums[mid]);
					list.add(nums[right]);
					lists.add(list);

					//去重:[-2,0,0,2,2] 防止 [[-2,0,2],[-2,0,2]]
					while (mid<right && nums[mid]==nums[mid+1]){
						mid=mid+1;
					}
					while (mid<right && nums[right]==nums[right-1]){
						right=right-1;
					}
					mid=mid+1;
					right=right-1;

				}else if(nums[left]+nums[mid]+nums[right]<0){
					mid+=1;
				}else {
					right-=1;
				}
			}

		}
		return lists;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
