# 百题斩

> 03课程1 -Array 

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | 笔记 | 
| --- | --- | --- | --- | --- | --- |--- |
|✔️|011 | [container-with-most-water](https://leetcode-cn.com/problems/container-with-most-water/) | medium|2020-06-24|2020-07-28|
|✔️| 283 |[move-zeroes](https://leetcode-cn.com/problems/move-zeroes/)|easy|2020-06-24|2020-07-28|计数后二次遍历，或边计数边赋值
|✔️|  70 |[climbing-stairs](https://leetcode.com/problems/climbing-stairs/)|easy|2020-06-24|2020-07-30|保留有效两个值，注意边界 代入4验证
|✔️| 15|[ 3sum](https://leetcode-cn.com/problems/3sum/)  |easy|2020-06-24|2020-07-30|需加强练习，注意边界，注意用i 还是nums[i],注意优化。
|✔️| 1|[ twosum](https://leetcode-cn.com/problems/two-sum) |easy|2020-08-03| 我们很容易想到用map，然后循环两次 ,却很少想起 一次就行


> 03课程2 Linked List  

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | 笔记 | 
| --- | --- | --- | --- | --- | --- |--- |
| ✔️️| 206 | [reverse-linked-list](https://leetcode.com/problems/reverse-linked-list/) | easy|2020-06-25
| ✔️️| 24|[ swap-nodes-in-pairs](https://leetcode.com/problems/swap-nodes-in-pairs)  |medium |2020-08-03|找到遍历的元素 找到头，判断当前的下一个 和下下一个
| ✔️️| 141|[ linked-list-cycle]( https://leetcode.com/problems/linked-list-cycle)  |easy|2020-08-04|快慢指针，fast=fast.next.next 
| ✔️️| 142|[ linked-list-cycle-ii]( https://leetcode.com/problems/linked-list-cycle-ii)  |medium|2020-08-04|用set;还有一种方法公式推导的还没看明白😕
| ✔️️| 143|[ linked-list-cycle-ii]( https://leetcode.com/problems/reorder-list)  |medium|2020-08-04|需要多练 组合了链表几个基本方法
| ✔️️| 25|[ reverse-nodes-in-k-group]( https://leetcode.com/problems/reverse-nodes-in-k-group/)  |hard|2020-08-05| 感觉这道题还需要练习96遍。。。
 
课后作业

| 待办| 题号 | 题目 | 难度 |  date1 | 备注 | data2 | 
| --- | --- | --- | --- | --- | --- |--- |
| ✔️️| 26 | [remove-duplicates-from-sorted-array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | easy|2020-08-06|写完了我才知道我用的是快慢指针
| ✔️️| 189 | [rotate-array](https://leetcode.com/problems/rotate-array/) | easy but to me ,its hard 😭|2020-08-11|  被while条件搞蒙了，看答案却用的do while 是比我的好
| ️️|   | [merge-two-sorted-lists](https://leetcode-cn.com/problems/merge-two-sorted-lists/) |easy|弄错了 弄成反转了
| ️️|   | [merge-sorted-array](https://leetcode-cn.com/problems/merge-sorted-array/) | | 
| ️️|   | [plus-one](https://leetcode-cn.com/problems/plus-one/) | | 


> 04课程

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | 笔记 | 
| --- | --- | --- | --- | --- | --- |--- |
|✔️|155|[min-stack](https://leetcode-cn.com/problems/min-stack)|easy|easy||
|️|242 | [valid-anagram](https://leetcode-cn.com/problems/valid-anagram/) |  | | |
|️|  | [largest-rectangle-in-histogram](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/) |  | | |
|️|  | [sliding-window-maximum](https://leetcode-cn.com/problems/sliding-window-maximum/) |  | | |
|️| | [valid-anagram](https://leetcode-cn.com/problems/valid-anagram/) |  | | |
|️| | [design-circular-deque](https://leetcode-cn.com/problems/design-circular-deque/) |  | | |
|️| | [trapping-rain-water](https://leetcode-cn.com/problems/trapping-rain-water/) |  | | |

 
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
   
