// Problem Statement -> https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // Step 1 : First create a hashmap and while traversing the string keep on adding characters
        // untill map contains the character. then keep on removing characters from  hashmap untill 
        // the first occurence of that character in hashmap is nomore and then keep on repeating it 
        
        // and each time update the the longest substring length
        if(s.length() == 0) return 0;
        
        int windowEnd = 0;
        int windowStart = 0;
        int maxLen = 0;
        
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(windowEnd = 0;windowEnd < s.length(); windowEnd++){
            
            char ch = s.charAt(windowEnd);
            
            if(hm.containsKey(ch)){
                windowStart = Math.max(windowStart , hm.get(ch)+1);
            }
            
            hm.put(ch,windowEnd);
            maxLen = Math.max(maxLen, windowEnd-windowStart+1);
        }
        
       return maxLen; 
    }
}