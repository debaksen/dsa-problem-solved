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
    public int minDepth(TreeNode root) {
        
        int depth = 0;
        if(root == null)
            return depth;
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        while(queue.size() > 0){
            
            int size = queue.size();
            depth++;
            
            for(int currIdx = 0; currIdx < size ; currIdx++){
