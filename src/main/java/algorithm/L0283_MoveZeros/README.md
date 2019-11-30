## 283. Move Zeroes

### 题目

> Given an array nums, write a function to move all 0's to the end of it while 
> maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.

### 题目中文

给定一个数组，写一个函数在不改变非0元素相对位置的情况下将值为0的元素移动至最后


### 思路

#### 方案一：开辟新数组

- 新建一个数组，数组长度和给定的数组长度一致
- 遍历原数组，如果数据不为零，将数据赋值给新数组
- 遍历新数组，将新数组的值赋值给原数组
- 其余的元素赋值为0


#### 思路2：

- 使用两个指针A，B
- A指针表示他之前的元素都是不为0的，从0开始
- B指针向后遍历，如果元素不为0，则和A指针的值交换，指针从0开始
- 结束条件是B指针遍历结束