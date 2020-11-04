/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null)
            return false;
        
        // STEP 1 : Start with root node -> 
        // In each case if the root node is't a leaf node make sum = sum - root.val
        // and call root.left and root.right 
        
        // STEP 2 : if the current node is leaf node then check if the currNode.val == sum 
        //          if yes the return true else return false;
        
        
        if(root.left != null || root.right != null){
            sum = sum-root.val;
