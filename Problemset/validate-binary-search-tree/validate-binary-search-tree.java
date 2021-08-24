
// @Title: 验证二叉搜索树 (Validate Binary Search Tree)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-23 13:28:33
// @Runtime: 0 ms
// @Memory: 38 MB

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
    public boolean isValidBST(TreeNode root) {
        return validHelper(root,null,null);
    }

    public boolean validHelper(TreeNode root, Integer low, Integer high) {
        if (root == null) { return true; }
        int val = root.val;
        if (low != null && val <= low) { return false; }
        if (high != null && val >= high) { return false; }
        return validHelper(root.left, low, val) && validHelper(root.right,val,high);
    }
}
