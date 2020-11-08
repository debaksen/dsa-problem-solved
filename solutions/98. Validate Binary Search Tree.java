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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return (p.val == q.val && helperSame(p.left,q.left) && helperSame(p.right,q.right));
    }
    
    private static boolean helperSame(TreeNode p, TreeNode q){
        
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        
        if(p.val != q.val) return false;
        
        return (helperSame(p.left,q.left) && helperSame(p.right,q.right));
    }
}
