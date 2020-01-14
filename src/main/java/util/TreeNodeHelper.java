package util;

public class TreeNodeHelper {


    /**
     * 生成二叉树
     * @param arr
     * @return
     */
    @Deprecated
    public static TreeNode generatorTree(Integer[] arr) {
        TreeNode root = new TreeNode(arr[0]);
        int index = 0;
        while (2 * index + 2 < arr.length) {
            if (arr[index] == null) {
                index++;
                continue;
            }
            root.left = new TreeNode(arr[2 * index + 1] == null ? 0 : arr[2 * index + 1]);
            root.right = new TreeNode(arr[2 * index + 2] == null ? 0 : arr[2 * index + 2]);

            index++;
        }
        return root;
    }



}
