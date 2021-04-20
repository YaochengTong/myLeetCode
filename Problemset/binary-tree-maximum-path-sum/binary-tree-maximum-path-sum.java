
// @Title: 二叉树中的最大路径和 (Binary Tree Maximum Path Sum)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-15 17:54:48
// @Runtime: 1 ms
// @Memory: 40 MB

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    public int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    public int dfs(TreeNode root) {
        if (root == null) { return 0; }
        int leftSum = Math.max(dfs(root.left), 0);
        int rightSum = Math.max(dfs(root.right), 0);
        maxSum = Math.max(root.val + leftSum + rightSum, maxSum);
        return root.val + Math.max(leftSum, rightSum);
    }

}
