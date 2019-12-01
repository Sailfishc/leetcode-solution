# [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 题目

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

```c
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.
```

Example 2:

```c
Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.
```

Clarification:

Confused why the returned value is an integer but your answer is an array?

Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.

Internally you can think of this:

```c
// nums is passed in by reference. (i.e., without making a copy)
int len = removeElement(nums, val);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for (int i = 0; i < len; i++) {
    print(nums[i]);
}
```


## 题目大意

在一个有序数组中，如果出现重复元素，保留一个，删除其余的重复元素。

> 要求：

- 不能开辟新的数组
- 空间复杂度是O(1)
- 必须在现有的数组上去修改

> 注意事项

- 因为数组长度给定了，所以不能改变，但是原数组的元素是去除重复后的元素，该怎么处理呢？举一个例子：
输入是[1,1,2]，长度是3，返回的int值是2，数组最正确的是[1,2]，但是数组长度已经是3了，其实最后
数组的内容可以是[1,2,2]，或者任何[1,2,x]类似，因为返回的int值是2，OJ系统只会判断前2个元素的值
是否正确

## 解题思路

- 定义count=1（因为如果数组不为空则至少有1个元素），count为返回的结果，他的意思是删除其他重复元素后剩余的元素个数
- 定义index，从1开始，比较当前值和前一个值是否一致，如果一致，则说明是重复元素，遍历下一个
- 如果不重复，说明当前的值不重复，将该值赋值给count，此时[0, count]的元素是没有重复的（关键：因为数组是有序的）
- 对count++（此时有可能有重复元素，但是count是个数，从1开始，数组的索引从0开始，所以OJ判题的时候数组的值其实是
[0, count) -- 左闭右开