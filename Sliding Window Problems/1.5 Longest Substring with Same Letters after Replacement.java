// Problem Statement -> https://leetcode.com/problems/longest-repeating-character-replacement/

class Solution {
    public int characterReplacement(String s, int k) {
        
        // STEP 1 : first take a hashmap and store each element's occurence in such a way that
        // if a character repeats itself make it as mostRepeatingLetter. 
        // Now we have to find a window of substring with mostRepeatingLetter such that the
        // count of other letters in the window should be less than k 
        
        int windowEnd = 0;
        int windowStart = 0;
        int mostRepeatingLetter = 0;
        int longestChar = 0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(windowEnd = 0; windowEnd < s.length(); windowEnd++){
            
            char charEnd = s.charAt(windowEnd);
            map.put(charEnd, map.getOrDefault(charEnd , 0)+1);   // save the individual letter's occurence in a hashmap 
            
            mostRepeatingLetter = Math.max(mostRepeatingLetter,map.get(charEnd)); // in each iteration find the mostRepeating letter 
            
            if(windowEnd - windowStart+1 - mostRepeatingLetter > k){     // when the non-most-repeating element's count becomes > k         
                                                                        // reduce the window size form the windowStart and windowStart++
                char charStart = s.charAt(windowStart);
                map.put(charStart , map.get(charStart)-1);
                windowStart++;
            }
            
            longestChar = Math.max(longestChar,windowEnd - windowStart +1 ); // (windowEnd - windowStart + 1) is the window size 
        }                                                                    // after each iteration update our longest char
                        
        return longestChar;
    }
}