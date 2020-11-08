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

// Iterative approach  

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<Integer>();
        if(root == null) return list;
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
           
            root = st.pop();
            list.add(root.val);
            
            if(root.right != null){
                st.push(root.right);
            }
            
            if(root.left != null){
                st.push(root.left);
            }
        }
        
        return list; 
    }
}

// Recursive approach

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
   
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        fillPreOrder(root,list);
        return list;       
    }
    
    private static void fillPreOrder(TreeNode root, List<Integer> list){
        
        if(root != null){
            list.add(root.val);
            fillPreOrder(root.left,list);
            fillPreOrder(root.right,list);
        }
    }
}
