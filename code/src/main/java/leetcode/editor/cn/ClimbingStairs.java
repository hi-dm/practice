package leetcode.editor.cn;

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划

//https://leetcode-cn.com/problems/climbing-stairs
class ClimbingStairs{
	public static void main(String[] args) {
		Solution solution = new ClimbingStairs().new Solution();
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
    	if (n==1){
    		return 1;
		}
    	if (n==2){
    		return 2;
		}
			int s1=1;
			int s2=2;
			int s3=3;
		for (int i = 3; i <n ; i++) {
			s1=s2;
			s2=s3;
			s3=s2+s1;
		}
		return s3;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
