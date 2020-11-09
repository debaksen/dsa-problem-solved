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
    
    private int preindex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if(preorder.length == 0 || inorder.length == 0) return null;
        
        int ie = preorder.length-1;
        
        Map<Integer,Integer> map = new HashMap<>();
         
        for(int i=0;i<=ie;i++){
            map.put(inorder[i] , i);
        }
        
        return cTree(inorder, preorder , 0 , ie, map);
    }
    
    
    private TreeNode cTree(int[] inorder, int[] preorder , int si , int ei, Map<Integer,Integer> map)
    
    {
        
        if(si > ei) return null;
        
        TreeNode root = new TreeNode(preorder[preindex]);
        preindex++;
      
        int intIndex = map.get(root.val);
        
        root.left = cTree(inorder,preorder,si,intIndex-1,map);
        root.right = cTree(inorder,preorder,intIndex+1,ei,map);
        return root;
    }
}
