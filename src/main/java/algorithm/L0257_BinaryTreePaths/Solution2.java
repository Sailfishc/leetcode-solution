package algorithm.L0257_BinaryTreePaths;

import util.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * LeetCode题目：https://leetcode-cn.com/problems/binary-tree-paths/
 *
 * https://github.com/power-algorithm/Leetcode-1-300/blob/master/_257_BinaryTreePaths.java
 */
public class Solution2 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        helper(res, root, "");

        return res;
    }

    private void helper(List<String> res, TreeNode root, String path) {
        if (root.left == null && root.right == null) {
            res.add(path + root.val);
            return;
        }

        if (root.left != null) {
            helper(res, root.left, path + root.val + "->");
        }

        if (root.right != null) {
            helper(res, root.right, path + root.val + "->");
        }
    }


}
