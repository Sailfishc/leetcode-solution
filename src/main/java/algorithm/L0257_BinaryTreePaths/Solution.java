package algorithm.L0257_BinaryTreePaths;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * LeetCode题目：https://leetcode-cn.com/problems/binary-tree-paths/
 *
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
       // 终止条件：Begin
        if (root == null) {
            return res;
        }
        if (root.left == null && root.right == null) {
            res.add(String.valueOf(root.val));
            return res;
        }
        // 终止条件：End

        final List<String> left = binaryTreePaths(root.left);
        for (String s : left) {
            res.add(root.val + "->" + s);
        }

        final List<String> right = binaryTreePaths(root.right);
        for (String s : right) {
            res.add(root.val + "->" + s);
        }

        return res;
    }




}
