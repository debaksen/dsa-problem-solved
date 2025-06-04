// User function Template for Java

class Solution {
    static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) return; 
        
        int buffer = s.pop(); 
        reverse(s); 
        placeElement(s,buffer); 
        
        return; 
        
    }
    
    static void placeElement(Stack<Integer> s,int num){
        
        if(s.isEmpty()){
            s.push(num);
            return; 
        }
        int buffer = s.pop(); 
        placeElement(s,num);
        s.push(buffer);
    }
}
