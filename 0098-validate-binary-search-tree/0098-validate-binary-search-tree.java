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
    long preVal = Long.MIN_VALUE;
    boolean isValid = true;
    public boolean isValidBST(TreeNode root) {
        inOrder(root);
        return isValid;
    }
    public void inOrder(TreeNode root){
        if(root == null) return ;

        inOrder(root.left);

        if(preVal >= root.val) isValid = false;
        preVal = root.val;

        inOrder(root.right);
    }
}