# 百题斩
如果有什么不开心，就刷题吧~
刷完题不就开心了~

> 03课程1 -Array 

| 待办| 题号 | 题目 | 难度 |  date1 | 笔记 | 笔记 | 
| --- | --- | --- | --- | --- | --- |--- |
|✔️|011 | [container-with-most-water](https://leetcode-cn.com/problems/container-with-most-water/) | medium|2020-06-24|2020-07-28|
|✔️| 283 |[move-zeroes](https://leetcode-cn.com/problems/move-zeroes/)|easy|2020-06-24|2020-07-28|计数后二次遍历，或边计数边赋值
|✔️|  70 |[climbing-stairs](https://leetcode.com/problems/climbing-stairs/)|easy|2020-06-24|2020-07-30|保留有效两个值，注意边界 代入4验证
|✔️| 15|[ 3sum](https://leetcode-cn.com/problems/3sum/)  |easy|2020-06-24|需加强练习，注意边界，注意用i 还是nums[i],注意优化。|round3只错了一个边界，调试过了，有极大的进步
|✔️| 1|[twosum](https://leetcode-cn.com/problems/two-sum) |easy|2020-08-03| 我们很容易想到用map，然后循环两次 ,却很少想起 一次就行| 之后不用刷了
|✔️| 66|[plus-one](https://leetcode-cn.com/problems/plus-one) |easy|2020-08-03| 加1进位  digits = new int[digits.length + 1];  digits[0] = 1;
|✔️| 151|[reverse-words-in-a-string](https://leetcode-cn.com/problems/reverse-words-in-a-string) |mid|2020-09-28| 正则 +trim
|✔️| 151|[reverse-words-in-a-string-iii](https://leetcode-cn.com/problems/reverse-words-in-a-string-iii) |mid|分块，然后逐个append 
|✔️| 27|[remove-element](https://leetcode-cn.com/problems/remove-element) |easy| 


> 03课程2 Linked List  

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | 笔记 | 
| --- | --- | --- | --- | --- | --- |--- |
| ✔️️| 206 | [reverse-linked-list](https://leetcode.com/problems/reverse-linked-list/) | easy|2020-06-25
| ✔️️| 24|[ swap-nodes-in-pairs](https://leetcode.com/problems/swap-nodes-in-pairs)  |medium |2020-08-03|找到遍历的元素 找到头，判断当前的下一个 和下下一个 还需要联系！！
| ✔️️| 141|[ linked-list-cycle]( https://leetcode.com/problems/linked-list-cycle)  |easy|2020-08-04|快慢指针，fast=fast.next.next ，fast==slow 对比是不是同一个元素
| ✔️️| 142|[ linked-list-cycle-ii]( https://leetcode.com/problems/linked-list-cycle-ii)  |medium|2020-08-04|用set;还有一种方法公式推导的还没看明白😕
| ✔️️| 143|[ linked-list-cycle-ii]( https://leetcode.com/problems/reorder-list)  |medium|2020-08-04|需要多练 组合了链表几个基本方法，注意别环形
| ✔️️| 25|[ reverse-nodes-in-k-group]( https://leetcode.com/problems/reverse-nodes-in-k-group/)  |hard|2020-08-05| 感觉这道题还需要练习94遍。。。
| ✔️️| 88|[merge-sorted-array]( https://leetcode-cn.com/problems/merge-sorted-array)  |easy|2020-08-27| 从后向前，注意数组为空 .System.arraycopy(nums2,0,nums1,0,p2+1);
| ✔️️| 21|[merge-two-sorted-lists]( https://leetcode-cn.com/problems/merge-two-sorted-lists)  |easy|2020-08-11| 善于利用dummy 和pre,并且不是所有场景都有必要重新创建curr
| ✔️️| 541|[reverse-string-ii]( https://leetcode-cn.com/problems/reverse-string-ii)  |easy|2020-09-25| 思路不错 值得再看
 
课后作业

| 待办| 题号 | 题目 | 难度 |  date1 | 备注 | data2 | 
| --- | --- | --- | --- | --- | --- |--- |
| ✔️️| 26 | [remove-duplicates-from-sorted-array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | easy|2020-08-06|写完了我才知道我用的是快慢指针|哦也 一次过的哦
| ✔️️| 189 | [rotate-array](https://leetcode.com/problems/rotate-array/) | easy but to me ,its hard 😭|2020-08-11|  被while条件搞蒙了，看答案却用的do while 是比我的好
| ️️|   | [merge-two-sorted-lists](https://leetcode-cn.com/problems/merge-two-sorted-lists/) |easy|弄错了 弄成反转了
| ️️|   | [merge-sorted-array](https://leetcode-cn.com/problems/merge-sorted-array/) | | 
| ️️|   | [plus-one](https://leetcode-cn.com/problems/plus-one/) | | 


> 04课程

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | 笔记 | 
| --- | --- | --- | --- | --- | --- |--- |
|✔️|155|[min-stack](https://leetcode-cn.com/problems/min-stack)|easy|easy||
|✔️️|242 | [valid-anagram](https://leetcode-cn.com/problems/valid-anagram/) |easy  |解答思路设计挺巧妙的 s.charAt(i) - 'a' 保证了数组26个元素就可以 有点优秀 | |
|️× |84  | [largest-rectangle-in-histogram](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/) | hard |这道题答得不对。。 一上来就以为和之前见过的题一样 审题审题 | |
|️|  239| [sliding-window-maximum](https://leetcode-cn.com/problems/sliding-window-maximum/) | hard | | |
|✔️| 641| [design-circular-deque](https://leetcode-cn.com/problems/design-circular-deque/) | mid |被边界条件搞蒙了 还有rear 和 front 的意义不同 | |
|️| 42| [trapping-rain-water](https://leetcode-cn.com/problems/trapping-rain-water/) | hard | 先放一放吧| |
|×️| 39| [combination-sum](https://leetcode-cn.com/problems/combination-sum) | mid | 被挂在了树上| |
|✔| 917| [reverse-only-letters](https://leetcode-cn.com/problems/reverse-only-letters) | easy | 巧用栈倒序 秒啊| |

> 05课程 tree

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | 笔记 | 
| --- | --- | --- | --- | --- | --- |--- |
|️✔️|94|[binary-tree-inorder-traversal](https://leetcode-cn.com/problems/binary-tree-inorder-traversal)| 2020-09-09|多体会。。 || 
|️|40|[zui-xiao-de-kge-shu-lcof](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof)| | || 
|️|144|[binary-tree-preorder-traversal](https://leetcode-cn.com/problems/binary-tree-preorder-traversal)| | || 
|️|590|[n-ary-tree-postorder-traversal](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal)| | || 
|️|589|[n-ary-tree-preorder-traversal](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal)| | || 
|️|429|[n-ary-tree-level-order-traversal](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal)| | || 
|✔️|226|[invert-binary-tree](https://leetcode-cn.com/problems/invert-binary-tree)| 2020-09-16| 抄答案的时候 感觉挺容易的 || 
|️|589|[n-ary-tree-preorder-traversal](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal)| 2020-09-17| 巧用两个栈|| 
|️|590|[n-ary-tree-postorder-traversal](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal)| 2020-09-17| 巧用两个队列 || 
|️|429|[n-ary-tree-level-order-traversal](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal)| 2020-09-18| 层级遍历用队列，深度遍历用栈 || 

笔记：

1 nums1[p1+p2+1] = nums1[p1]>nums2[p2]?nums1[p1--]:nums2[p2--];
2 Q88  System.arraycopy(nums2,0,nums1,0,p2+1);

_____
>附项目leetcode 插件配置：
>>P${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug})
---
>>//第${question.frontendQuestionId}题
  //https://leetcode-cn.com/problems/${question.titleSlug}
  ${question.content}
  package leetcode.editor.cn;
  //java:${question.title}
  public class P${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug}){
      public static void main(String[] args){
          Solution solution = new P${question.frontendQuestionId}_$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
      }
      ${question.code}
  }
   
