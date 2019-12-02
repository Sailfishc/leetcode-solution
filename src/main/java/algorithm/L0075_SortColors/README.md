# [75. Sort Colors](https://leetcode.com/problems/sort-colors/)

## 题目

Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example 1:  

```
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```

Follow up:

- A rather straight forward solution is a two-pass algorithm using counting sort.  
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
- Could you come up with a one-pass algorithm using only constant space?


## 题目大意

### 思路一：计数排序

### 思路二：三路快速排序

- 有限集：[0,1,2]
- 将数据分为0-1-2三部分
- 设置两个标定点(zero, two)
    - [0-zero]值为0
    - [zero+1 -- i-1]值为1
    - [i, two]值为2