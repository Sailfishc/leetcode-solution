package algorithm.L0111_MinimumDepthOfBinaryTree;

import util.TreeNode;


/**
 * https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/submissions/
 * https://github.com/power-algorithm/Leetcode-1-300/blob/master/_111_MinimumDepthofBinaryTree.java
 */
public class Solution {


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null || root.right == null) {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;

    }
}
