class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        int size = (int)Math.floor((s.size()+1)/2); 
        deleteMidHelper(s,size); 
    }
    
    private static void deleteMidHelper(Stack<Integer> s, int mid){
        
        if(s.size() == mid){
            s.pop();
            return; 
        }
        
        int buffer = s.pop(); 
        deleteMidHelper(s,mid); 
        s.push(buffer);
        
        return; 
    }
}