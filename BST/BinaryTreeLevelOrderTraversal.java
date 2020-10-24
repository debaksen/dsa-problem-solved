 // Problem Statement - > https://leetcode.com/problems/binary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root == null){
           
            List<List<Integer>> blank = new ArrayList<>();
            return blank;
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        
        Queue<TreeNode> pq = new ArrayDeque<>(); 
    
        pq.add(root);
        
        while(pq.size() != 0){
            
            int size = pq.size();
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                
                root = pq.remove();
                list.add(root.val);
                
                   if(root.left != null){
                    pq.add(root.left);
                }
                
                if(root.right != null){
                    pq.add(root.right);
                }
                
            }
            
            res.add(list);
            
        }
        
        return res;
        
    }
}
