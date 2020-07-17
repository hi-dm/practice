package leetcode.editor.cn;

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

//https://leetcode-cn.com/problems/move-zeroes
class MoveZeroes{
	public static void main(String[] args) {
		Solution solution = new MoveZeroes().new Solution();

		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
    	if (nums==null || nums.length==0){
    		return;
		}
//    	//记录非0个数,先把非零的数字补到对应位置，后续都是0
//    	int x=0;
//		for (int i = 0; i <nums.length ; i++) {
//			if (nums[i]!=0){
//				nums[x++]=nums[i];
//			}
//		}
//		for (int i = x; i < nums.length; i++) {
//			nums[i]=0;
//		}
		//解法2
		int count=0;
		for (int i = 0; i <nums.length ; i++) {
			if (nums[i]==0){
				count++;
			}else if(count>0) {
				nums[i-count]=nums[i];
				nums[i]=0;
			}
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
