package algorithm.L0113_PathSum2;


import util.PrintUtils;
import util.TreeNode;
import util.TreeNodeHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/path-sum-ii/
 */
public class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        final ArrayList<Integer> list = new ArrayList<>();
        helper(res, root, list, sum);

        return res;
    }

    private void helper(List<List<Integer>> res, TreeNode root, List<Integer> list, int sum) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        // 终止条件
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                res.add(new ArrayList<>(list));
            }
        }

        helper(res, root.left, list, sum - root.val);
        helper(res, root.right, list, sum - root.val);
        list.remove(list.size() - 1);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        final TreeNode treeNode = TreeNodeHelper.generatorTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        final List<List<Integer>> lists = solution.pathSum(treeNode, 22);
        for (List<Integer> list : lists) {
            PrintUtils.println(list);
        }

    }
}
