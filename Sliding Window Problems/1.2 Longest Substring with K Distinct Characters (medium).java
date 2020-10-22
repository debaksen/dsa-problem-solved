
 // Problem link : https://www.lintcode.com/problem/longest-substring-with-at-most-k-distinct-characters/description
public class Solution {
    /**
     * @param s: A string
     * @param k: An integer
     * @return: An integer
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        
        // STEP 1 : first we'll store individual characters in hashmap starting from idx = 0 -> n
        // untill the size of hashmap becomes <= k
        
        //STEP2 : Now at this time we'll store the size of the substring as longestSubString
        // we'll keep on removing elements from hashmap form the firstIndex untill we can add new elements
        // in the hashmap in such  a way that length of hashmap does't  get beyond k 
        
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        int maxSize = 0;
        int currSize = 0;
        int StartIndex = 0;
        
       
        
        for(int index = 0; index<s.length(); index++){
           
            char ch = s.charAt(index);
            
           
            map.put(ch , map.getOrDefault(ch,0) + 1);
            currSize++;
            
            if(map.size() > k ){
                maxSize = Math.max(currSize - 1, maxSize); 
            }
            
            while(map.size() > k ) {
                
               char startChar = s.charAt(StartIndex);
               if(map.get(startChar) > 1){
                   map.put(startChar , map.get(startChar)-1 );
               }
               else {
                   map.remove(startChar);
               }
               
               StartIndex++;
               currSize--;
                }
                
                
            maxSize = Math.max(maxSize, currSize);    
            }
            
            return maxSize; 
            
        }  
    
    }