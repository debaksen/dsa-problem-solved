// Problem  Statement -> 

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean leftToRight = true;   
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            List<Integer> list = new LinkedList<>();
            
            
            for(int currLevel = 0; currLevel < size; currLevel++){
                
                TreeNode currNode = queue.remove();
                if(leftToRight){
                    list.add(currNode.val);
                }
                else { 
                    list.add( 0 , currNode.val);     // Secoend iteration -> when [9 , 20] 
                                                     // then leftToRight -> false [20 , 9] becomes o/p
                }
                
                if(currNode.left != null){
                     queue.add(currNode.left);
                }
                   
                
                if(currNode.right != null){
                    queue.add(currNode.right);
                }
                    
               
                }
                
             result.add(list);
            
             leftToRight = !leftToRight;
            }
           
            return result;
        }
       
    }
