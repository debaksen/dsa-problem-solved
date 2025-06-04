/*Complete the function below*/
class Solution {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here
        
        if(s.size() <= 1){
            return s; 
        }
        
        // Induction step 
        int elem = s.pop();
        sort(s); 
    
     // put elem to it's correct position :     
        if(!s.isEmpty() && s.peek() > elem){
            
            Stack<Integer> buffer = new Stack<Integer>(); 
            while(!s.isEmpty() && s.peek() > elem){
                buffer.push(s.pop()); 
            }
            s.push(elem);
            while(!buffer.isEmpty()){
                s.push(buffer.pop()); 
            }
        }else{
            s.push(elem); 
        }
        
        return s;
        
    }
}