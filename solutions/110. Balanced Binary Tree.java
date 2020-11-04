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
    
    private boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        
        if(root == null) return true;
        sizeOf(root); // it will check the first left sub tree  & right 
        return flag;
    }
    
    private int sizeOf(TreeNode curr){
        
        if(curr == null) return 0;
        
        int l = sizeOf(curr.left);
        int r = sizeOf(curr.right);
