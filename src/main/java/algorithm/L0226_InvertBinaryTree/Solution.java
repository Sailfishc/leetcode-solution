package algorithm.L0226_InvertBinaryTree;


import util.TreeNode;


/**
 * https://leetcode-cn.com/problems/invert-binary-tree/submissions/
 * 解法：https://github.com/power-algorithm/Play-with-Algorithm-Interview/blob/master/07-Binary-Tree-and-Recursion/Course%20Code%20(Java)/02-Invert-Binary-Tree/src/Solution.java
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        final TreeNode left = invertTree(root.left);
        final TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }


    public static void main(String[] args) {

    }

}
