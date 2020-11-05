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
    public boolean isValidBST(TreeNode root) {
        
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        
        // for left sub tree we change the uppervalue - as the curr node's val
        
        // for right sub tree change the lower value - as the curr node's val
        
        if(root == null) return true;
        
        return (helperFunc(root, min, max));
    }
               
    private boolean helperFunc(TreeNode root , long min, long  max){
