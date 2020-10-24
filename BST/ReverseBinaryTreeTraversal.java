// Problem statement -- > https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        // Similar to Level Order Traversal I , only difference add each level at the front of the
        // linkedlist each time 
        
        // Instead of ArrayList here we'll use Linkedlist because the cost of insertion at the front of 
        // Arraylist is much costly 
       
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        
        
        
        while(queue.size() > 0){
            
            int size = queue.size();
            List<Integer> currList = new ArrayList<Integer>(size);
            
            for(int currLevel = 0 ; currLevel < size ; currLevel++){
                
                TreeNode currNode = queue.remove();
                currList.add(currNode.val);
                
                
                if(currNode.left != null){
                    queue.add(currNode.left);
                }
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
               
            }
            
           // After each iteration add the sub-list at the front of the result list
            
            result.add(0,currList);
        }
        
        return result;
    }
}
