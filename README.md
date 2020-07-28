# 刷题之路

> 03课程1 -Array 

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | date3 | 
| --- | --- | --- | --- | --- | --- |--- |
|✔️|011 | [container-with-most-water](https://leetcode-cn.com/problems/container-with-most-water/) | medium|2020-06-24|2020-07-28
|✔️| 283 |[move-zeroes](https://leetcode-cn.com/problems/move-zeroes/)|easy|2020-06-24
|✔️|  70 |[climbing-stairs](https://leetcode.com/problems/climbing-stairs/)|easy|2020-06-24
|✔️| 15|[ 3sum](https://leetcode-cn.com/problems/3sum/)  |easy|2020-06-24


> 03课程2 Linked List  

| 待办| 题号 | 题目 | 难度 |  date1 | date2 | date3 | 
| --- | --- | --- | --- | --- | --- |--- |
| ✔️️| 206 | [reverse-linked-list](https://leetcode.com/problems/reverse-linked-list/) | easy|2020-06-25
| | 24|[ swap-nodes-in-pairs](https://leetcode.com/problems/swap-nodes-in-pairs)  |medium
| | 141|[ linked-list-cycle]( https://leetcode.com/problems/linked-list-cycle)  |easy
| | 142|[ linked-list-cycle-ii]( https://leetcode.com/problems/linked-list-cycle-ii)  |medium
| | 25|[ reverse-nodes-in-k-group]( https://leetcode.com/problems/reverse-nodes-in-k-group/)  |hard
 
课后作业

https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
https://leetcode-cn.com/problems/rotate-array/
https://leetcode-cn.com/problems/merge-two-sorted-lists/
https://leetcode-cn.com/problems/merge-sorted-array/
https://leetcode-cn.com/problems/two-sum/
https://leetcode-cn.com/problems/move-zeroes/
https://leetcode-cn.com/problems/plus-one/
 
 
 
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
   
