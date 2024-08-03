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
    public int goodNodes(TreeNode root) {
        return helper(root,0,Integer.MIN_VALUE);
    }
    public int helper(TreeNode root,int ans,int curMax){
        if(root == null) return 0;
        
        int rootanswer =0;
        if(root.val >= curMax){
            rootanswer =1;
            curMax = root.val;
        }
        int left = helper(root.left,ans, curMax);
        int right = helper(root.right,ans, curMax);
        return left+right+rootanswer;
    }
}