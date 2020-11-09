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
    
    TreeNode prev = null;
    public void flatten(TreeNode root) {
       
      if(root == null)return;
     
      TreeNode leftsub = root.left;
      TreeNode rightsub = root.right;
        
      root.left = null;
        
      if(prev == null) {
          prev = root;
      }
      
      else { 
      prev.right = root;
      
      }
      prev = root;
      flatten(leftsub);
      flatten(rightsub); 
      
    }
}
